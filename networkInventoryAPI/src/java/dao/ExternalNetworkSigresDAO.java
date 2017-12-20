/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.entity.ExternalNetworkSigres;

/**
 *
 * @author G0042204
 */
public interface ExternalNetworkSigresDAO {

    public ExternalNetworkSigres consultar(String terminal) throws Exception;
}
