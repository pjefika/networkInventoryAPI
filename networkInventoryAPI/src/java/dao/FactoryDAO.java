/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.entity.NetworkInventoryMetalico;
import model.entity.NetworkInventorySigresFibra;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static NetworkInventoryGponDAO createGponVivo2() {
        return new NetworkInventoryGponDAOImpl();
    }

    public static EfikaCustomerInterface<NetworkInventoryMetalico> createMetalicoVivo2() {
        return new NetworkInventoryMetalicoDAO();
    }

    public static EfikaCustomerInterface<NetworkInventorySigresFibra> createFibraVivo1() {
        return new NetworkInventorySigresFibraDAO();
    }

    public static OltDetailSigresFibraDAO createOltDetailSigresFibraDAO() {
        return new OltDetailSigresFibraDAOImpl();
    }

    public static ExternalNetworkSigresDAO createENSigresDAO() {
        return new ExternalNetworkSigresDAOImpl();
    }

}
