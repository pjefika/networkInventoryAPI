/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.controller;

import javax.ws.rs.core.Response;

/**
 *
 * @author G0042204
 */
public interface EfikaCustomerRestInter {

    public Response getCliente(String instancia);

}
