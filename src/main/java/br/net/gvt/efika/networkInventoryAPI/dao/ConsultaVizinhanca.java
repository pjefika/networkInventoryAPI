/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface ConsultaVizinhanca <T>{

    public List<T> consultarVizinhos(T inventory, Integer qtde) throws Exception;

}
