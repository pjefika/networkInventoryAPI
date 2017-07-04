/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import dao.EfikaCustomerInterface;
import dao.FactoryDAO;
import dao.FactoryEntityManager;
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
    }

    @Override
    public EfikaCustomerDTO consultar(String instancia) throws Exception {
        try {
            gpon = FactoryDAO.createGpon();
            NetworkInventoryGpon g = gpon.consultarCliente(instancia);
            return new EfikaCustomerDTO(g);
        } catch (Exception e) {
            try {
                metalico = FactoryDAO.createMetalico();
                NetworkInventoryMetalico met = metalico.consultarCliente(instancia);
                return new EfikaCustomerDTO(met);
            } catch (Exception ex) {
                throw new CustomerNotFound();
            }finally{
                metalico.close();
            }
        } finally {
            gpon.close();
            FactoryEntityManager.getInstance().close();
        }
    }

}
