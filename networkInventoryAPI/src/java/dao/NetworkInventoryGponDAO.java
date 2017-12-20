/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.entity.NetworkInventoryGpon;

/**
 *
 * @author G0042204
 */
public interface NetworkInventoryGponDAO extends EfikaCustomerInterface<NetworkInventoryGpon>, ConsultaVizinhanca<NetworkInventoryGpon> {

    @Override
    public List<NetworkInventoryGpon> consultarVizinhos(NetworkInventoryGpon inventory,  Integer qtde) throws Exception;
}
