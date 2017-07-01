/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventoryMetalico;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static EfikaCustomerInterface<NetworkInventoryGpon> createGpon() {
        return new NetworkInventoryGponDAO();
    }

    public static EfikaCustomerInterface<NetworkInventoryMetalico> createMetalico() {
        return new NetworkInventoryMetalicoDAO();
    }

}
