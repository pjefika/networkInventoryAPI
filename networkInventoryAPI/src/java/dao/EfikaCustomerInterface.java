/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.entity.NetworkInventory;


/**
 *
 * @author G0042204
 */
public interface EfikaCustomerInterface {

    public NetworkInventory consultarCliente(String param1) throws Exception;

}
