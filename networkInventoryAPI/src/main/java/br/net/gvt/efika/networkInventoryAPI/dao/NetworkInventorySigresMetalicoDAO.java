/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventorySigresMetalico;

/**
 *
 * @author G0042204
 */
public interface NetworkInventorySigresMetalicoDAO {

    public NetworkInventorySigresMetalico consultar(String nrcOrTerminal) throws Exception;

    public NetworkInventorySigresMetalico consultarDslamDetail(String nomeDslam) throws Exception;
}
