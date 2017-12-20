/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import dao.EfikaCustomerInterface;
import dao.ExternalNetworkSigresDAO;
import dao.FactoryDAO;
import dao.OltDetailSigresFibraDAO;
import model.domain.exception.CustomerNotFound;
import model.entity.ExternalNetworkSigres;
import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventoryMetalico;
import model.entity.NetworkInventorySigresFibra;

/**
 *
 * @author G0042204
 */
public class CustomerServiceImpl implements CustomerService {

    private EfikaCustomerInterface<NetworkInventoryGpon> gpon;
    private EfikaCustomerInterface<NetworkInventoryMetalico> metalico;
    private EfikaCustomerInterface<NetworkInventorySigresFibra> sigresFibra;
    private OltDetailSigresFibraDAO oltDetail;
    private ExternalNetworkSigresDAO exnDAO;

    public CustomerServiceImpl() {
    }

    @Override
    public EfikaCustomerDTO consultar(String instancia) throws Exception {
        try {
            gpon = FactoryDAO.createGponVivo2();
            return new EfikaCustomerDTO(gpon.consultarCliente(instancia));
        } catch (Exception e) {
            try {
                metalico = FactoryDAO.createMetalicoVivo2();
                return new EfikaCustomerDTO(metalico.consultarCliente(instancia));
            } catch (Exception ex) {
                try {
                    sigresFibra = FactoryDAO.createFibraVivo1();
                    oltDetail = FactoryDAO.createOltDetailSigresFibraDAO();
                    exnDAO = FactoryDAO.createENSigresDAO();
                    NetworkInventorySigresFibra sigres = sigresFibra.consultarCliente(instancia);
                    ExternalNetworkSigres sagre = null;
                    try {
                        sagre = exnDAO.consultar(sigres.getTerminal());
                    } catch (Exception ex1) {
                        sagre = null;
                    }
                    return new EfikaCustomerDTO(sigres, oltDetail.consultar(sigres.getNomeOlt()), sagre);
                } catch (Exception ex2) {
                    throw new CustomerNotFound();
                }
            }
        }
    }

}
