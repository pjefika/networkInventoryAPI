/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class ClientesVizinhosResponse {

    private List<EfikaCustomerDTO> vizinhos;

    public ClientesVizinhosResponse() {
    }

    public List<EfikaCustomerDTO> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<EfikaCustomerDTO> vizinhos) {
        this.vizinhos = vizinhos;
    }
}
