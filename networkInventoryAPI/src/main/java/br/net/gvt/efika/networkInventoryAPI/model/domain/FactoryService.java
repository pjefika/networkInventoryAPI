/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.model.domain;

/**
 *
 * @author G0042204
 */
public class FactoryService {

    public static CustomerService createCustomerService() {
        return new CustomerServiceImpl();
    }

    public static ClientesVizinhosService createClientesVizinhosService() {
        return new ClientesVizinhosServiceImpl();
    }

}
