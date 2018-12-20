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
@Table(name = "SA005_INVENTARIO_REDE_GPON", schema = "dw_efika")
public class NetworkInventoryGpon implements Serializable {

    @Id
    @Column(name = "INSTANCIA")
    private String instancia;

    @Column(name = "DESIGNADOR_BANDA")
    private String designador;

    @Column(name = "DESIGNADOR_ACESSO")
    private String designadorAcesso;

    // Rede
    @Column(name = "IP_DSLAM")
    private String ipDslam;

    @Column(name = "VENDOR_SHELF")
    private String vendorDslam;

    @Column(name = "MODEL_SHELF")
    private String modeloDslam;

    @Column(name = "SLOT")
    private Integer slot;

    @Column(name = "PORTA")
    private Integer porta;

    @Column(name = "SEQUENCIAL")
    private Integer sequencial;

    @Column(name = "LOGICA_ONT")
    private Integer logica;

    @Column(name = "RIN")
    private Integer rin;

    @Column(name = "VLAN_VOIP")
    private Integer vlanVoip;

    @Column(name = "VLAN_VOD")
    private Integer vlanVod;

    @Column(name = "VLAN_MULTICAST")
    private Integer vlanMulticast;

    @Column(name = "CVLAN")
    private Integer cvLan;

    @Column(name = "SPLITTER_1_NIVEL")
    private String splitter1n;

    @Column(name = "SPLITTER_2_NIVEL")
    private String splitter2n;

    @Column(name = "CABO_ALIM")
    private String caboAlim;

    @Column(name = "FIBRA1N")
    private String fibra1n;

    @Column(name = "FIBRA2N")
    private String fibra2n;

    public NetworkInventoryGpon() {
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getDesignador() {
        return designador;
    }

    public void setDesignador(String designador) {
        this.designador = designador;
    }

    public String getDesignadorAcesso() {
        return designadorAcesso;
    }

    public void setDesignadorAcesso(String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }

    public String getIpDslam() {
        return ipDslam;
    }

    public void setIpDslam(String ipDslam) {
        this.ipDslam = ipDslam;
    }

    public String getVendorDslam() {
        return vendorDslam;
    }

    public void setVendorDslam(String vendorDslam) {
        this.vendorDslam = vendorDslam;
    }

    public String getModeloDslam() {
        return modeloDslam;
    }

    public void setModeloDslam(String modeloDslam) {
        this.modeloDslam = modeloDslam;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public Integer getLogica() {
        return logica;
    }

    public void setLogica(Integer logica) {
        this.logica = logica;
    }

    public Integer getRin() {
        return rin;
    }

    public void setRin(Integer rin) {
        this.rin = rin;
    }

    public Integer getVlanVoip() {
        return vlanVoip;
    }

    public void setVlanVoip(Integer vlanVoip) {
        this.vlanVoip = vlanVoip;
    }

    public Integer getVlanVod() {
        return vlanVod;
    }

    public void setVlanVod(Integer vlanVod) {
        this.vlanVod = vlanVod;
    }

    public Integer getVlanMulticast() {
        return vlanMulticast;
    }

    public void setVlanMulticast(Integer vlanMulticast) {
        this.vlanMulticast = vlanMulticast;
    }

    public Integer getCvLan() {
        return cvLan;
    }

    public void setCvLan(Integer cvLan) {
        this.cvLan = cvLan;
    }

    public String getSplitter1n() {
        return splitter1n;
    }

    public void setSplitter1n(String splitter1n) {
        this.splitter1n = splitter1n;
    }

    public String getSplitter2n() {
        return splitter2n;
    }

    public void setSplitter2n(String splitter2n) {
        this.splitter2n = splitter2n;
    }

    public String getCaboAlim() {
        return caboAlim;
    }

    public void setCaboAlim(String caboAlim) {
        this.caboAlim = caboAlim;
    }

    public String getFibra1n() {
        return fibra1n;
    }

    public void setFibra1n(String fibra1n) {
        this.fibra1n = fibra1n;
    }

    public String getFibra2n() {
        return fibra2n;
    }

    public void setFibra2n(String fibra2n) {
        this.fibra2n = fibra2n;
    }

}
