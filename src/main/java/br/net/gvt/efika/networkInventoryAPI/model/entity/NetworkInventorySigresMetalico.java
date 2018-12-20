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
@Table(name = "SA010_INVENTARIO_REDE_SIGRES_METALICO", schema = "dw_efika")
public class NetworkInventorySigresMetalico implements Serializable {

    /**
     * SELECT NRC, NOME_DSLAM, VLAN_REDE, VLAN_USUARIO, NOME_REDE_DSLAM,
     * TERMINAL, SLOT, IP_DSLAM, MODELO_DSLAM, FABRICANTE_DSLAM FROM
     * dw_efika.sa010_inventario_rede_sigres_metalico LIMIT 100;
     */
    @Id
    @Column(name = "NRC")
    private String nrc;

    @Column(name = "NOME_DSLAM")
    private String nomeDslam;

    @Column(name = "MODELO_DSLAM")
    private String modeloDslam;

    @Column(name = "IP_DSLAM")
    private String ipDslam;

    @Column(name = "NOME_REDE_DSLAM")
    private String nomeRedeDslam;

    @Column(name = "TERMINAL")
    private String terminal;

    @Column(name = "FABRICANTE_DSLAM")
    private String fabricanteDslam;

    @Column(name = "SLOT")
    private Integer slot;

    @Column(name = "VLAN_REDE")
    private Integer rin;

    @Column(name = "VLAN_USUARIO")
    private Integer cVlan;

    public NetworkInventorySigresMetalico() {
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNomeDslam() {
        return nomeDslam;
    }

    public void setNomeDslam(String nomeDslam) {
        this.nomeDslam = nomeDslam;
    }

    public String getNomeRedeDslam() {
        return nomeRedeDslam;
    }

    public void setNomeRedeDslam(String nomeRedeDslam) {
        this.nomeRedeDslam = nomeRedeDslam;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getFabricanteDslam() {
        return fabricanteDslam;
    }

    public void setFabricanteDslam(String fabricanteDslam) {
        this.fabricanteDslam = fabricanteDslam;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getRin() {
        return rin;
    }

    public void setRin(Integer rin) {
        this.rin = rin;
    }

    public Integer getcVlan() {
        return cVlan;
    }

    public void setcVlan(Integer cVlan) {
        this.cVlan = cVlan;
    }

    public String getModeloDslam() {
        return modeloDslam;
    }

    public void setModeloDslam(String modeloDslam) {
        this.modeloDslam = modeloDslam;
    }

    public String getIpDslam() {
        return ipDslam;
    }

    public void setIpDslam(String ipDslam) {
        this.ipDslam = ipDslam;
    }

}
