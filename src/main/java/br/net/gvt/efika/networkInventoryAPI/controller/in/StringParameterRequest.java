/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.controller.in;

import br.net.gvt.efika.customer.model.dto.GenericRequest;

/**
 *
 * @author G0042204
 */
public class StringParameterRequest extends GenericRequest {

    private String parameter;

    public StringParameterRequest() {
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

}
