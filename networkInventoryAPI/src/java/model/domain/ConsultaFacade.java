/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import dao.EfikaCustomerInterface;
import dao.FactoryDAO;
import model.domain.exception.CustomerNotFound;
import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventoryMetalico;

/**
 *
 * @author G0042204
 */
public class ConsultaFacade implements CustomerServiceInter {

    private EfikaCustomerInterface<NetworkInventoryGpon> gpon;

    private EfikaCustomerInterface<NetworkInventoryMetalico> metalico;

    public ConsultaFacade() {
        gpon = FactoryDAO.createGpon();
    }

    @Override
    public EfikaCustomerDTO consultar(String instancia) throws Exception {
        try {
            return new EfikaCustomerDTO(gpon.consultarCliente(instancia));
        } catch (Exception e) {
            try {
                metalico = FactoryDAO.createMetalico();
                return new EfikaCustomerDTO(metalico.consultarCliente(instancia));
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new CustomerNotFound();
            }
        }
    }

}
