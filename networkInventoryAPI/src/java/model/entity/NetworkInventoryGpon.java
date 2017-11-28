/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

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

    @Column(name = "SPLITTER_2_NIVEL")
    private String splSecundario;

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

    public String getSplSecundario() {
        return splSecundario;
    }

    public void setSplSecundario(String splSecundario) {
        this.splSecundario = splSecundario;
    }

}
