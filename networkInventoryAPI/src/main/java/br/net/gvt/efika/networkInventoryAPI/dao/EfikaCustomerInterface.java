/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface EfikaCustomerInterface <T> extends InterfaceDAO<T>{

    public T consultarCliente(String param1) throws Exception;

}
