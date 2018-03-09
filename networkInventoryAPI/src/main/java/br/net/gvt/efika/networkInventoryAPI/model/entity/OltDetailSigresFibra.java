/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "SA008_OLT_DETAIL", schema = "dw_efika")
public class OltDetailSigresFibra implements Serializable {

    /**
     * SELECT LOCALIDADE, SIGLA_AT, ENDIP_OLT, NOME_REDE_OLT, VENDOR_OLT,
     * MODEL_OLT FROM dw_efika.SA008_OLT_DETAIL LIMIT 100;
     */
    @Id
    @Column(name = "NOME_REDE_OLT")
    private String nomeOlt;

    @Column(name = "LOCALIDADE")
    private String localidade;

    @Column(name = "SIGLA_AT")
    private String siglaAt;

    @Column(name = "ENDIP_OLT")
    private String ipOlt;

    // Rede
    @Column(name = "VENDOR_OLT")
    private String vendor;

    @Column(name = "MODEL_OLT")
    private String model;


    public OltDetailSigresFibra() {
    }

    public String getNomeOlt() {
        return nomeOlt;
    }

    public void setNomeOlt(String nomeOlt) {
        this.nomeOlt = nomeOlt;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getSiglaAt() {
        return siglaAt;
    }

    public void setSiglaAt(String siglaAt) {
        this.siglaAt = siglaAt;
    }

    public String getIpOlt() {
        return ipOlt;
    }

    public void setIpOlt(String ipOlt) {
        this.ipOlt = ipOlt;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
