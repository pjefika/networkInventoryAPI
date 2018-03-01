/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventoryMetalico;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventorySigresFibra;

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

    public static NetworkInventorySigresFibraDAO createFibraVivo1() {
        return new NetworkInventorySigresFibraDAO();
    }

    public static OltDetailSigresFibraDAO createOltDetailSigresFibraDAO() {
        return new OltDetailSigresFibraDAOImpl();
    }

    public static ExternalNetworkSigresDAO createENSigresDAO() {
        return new ExternalNetworkSigresDAOImpl();
    }

    public static ConsultaVizinhanca<NetworkInventorySigresFibra> createNetworkInventorySigresFibraDAO() {
        return new NetworkInventorySigresFibraDAO();
    }

}
