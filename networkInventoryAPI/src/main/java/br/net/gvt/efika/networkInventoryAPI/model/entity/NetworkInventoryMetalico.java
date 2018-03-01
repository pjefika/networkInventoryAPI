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
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Table(schema = "dw_efika")
@NamedStoredProcedureQuery(
        name = "GET_INVENTARIO_METALICO",
        procedureName = "GET_INVENTARIO_METALICO",
        resultClasses = {NetworkInventoryMetalico.class},
        parameters = {
            @StoredProcedureParameter(name = "instancia", type = String.class, mode = ParameterMode.IN)
        }
)
@Entity
public class NetworkInventoryMetalico implements Serializable {

    @Id
    @Column(name = "instancia")
    private String instancia;

    @Column(name = "designador")
    private String designador;

    // Rede
    @Column(name = "ip_shelf")
    private String ipDslam;

    @Column(name = "fabricante_dslam")
    private String vendorDslam;

    @Column(name = "modelo_dslam")
    private String modeloDslam;

    @Column(name = "slot")
    private Integer slot;

    @Column(name = "porta")
    private Integer porta;

    @Column(name = "porta_sequencial")
    private Integer sequencial;

    @Column(name = "rin")
    private Integer rin;

    @Column(name = "vlan_voip")
    private Integer vlanVoip;

    @Column(name = "vlan_vod")
    private Integer vlanVod;

    @Column(name = "vlan_mcast")
    private Integer vlanMulticast;

    public NetworkInventoryMetalico() {
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

}
