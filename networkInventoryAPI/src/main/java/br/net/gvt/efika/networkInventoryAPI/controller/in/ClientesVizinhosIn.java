/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.controller.in;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class ClientesVizinhosIn {

    private EfikaCustomer ec;

    private Integer qtde;

    public ClientesVizinhosIn() {
        this.qtde = 5;
    }

    public EfikaCustomer getEc() {
        return ec;
    }

    public void setEc(EfikaCustomer ec) {
        this.ec = ec;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

}
