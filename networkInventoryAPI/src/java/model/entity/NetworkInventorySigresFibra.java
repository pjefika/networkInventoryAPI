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
@Table(name = "SA007_INVENTARIO_REDE_SIGRES_FIBRA", schema = "dw_efika")
public class NetworkInventorySigresFibra implements Serializable {

    /**
     * SELECT SLOT, PORTA, FIBRA, RIN, CVLAN, ID_CLIENTE, NRC, ID_ONT, VLAN_M,
     * VLAN_U, VLAN_A, VREDE_VOIP, REGIAO, SWC, SWD, UNIQUE_ID FROM
     * dw_efika.SA007_INVENTARIO_REDE_SIGRES_FIBRA LIMIT 100;
     */
    @Id
    @Column(name = "ID_FIBRA")
    private String idFibra;

    @Column(name = "TERMINAL")
    private String terminal;

    @Column(name = "NOME_OLT")
    private String nomeOlt;

    @Column(name = "SLOT")
    private Integer slot;

    @Column(name = "PORTA")
    private Integer porta;

    @Column(name = "RIN")
    private Integer rin;

    @Column(name = "CVLAN")
    private Integer cVlan;

    @Column(name = "ID_ONT")
    private String idOnt;

    @Column(name = "ID_CLIENTE")
    private Integer idCliente;

    @Column(name = "VREDE_VOIP")
    private Integer vlanVoip;

    @Column(name = "VLAN_U")
    private Integer vlanUnicast;

    @Column(name = "VLAN_M")
    private Integer vlanMulticast;

    public NetworkInventorySigresFibra() {
    }

    public String getIdFibra() {
        return idFibra;
    }

    public void setIdFibra(String idFibra) {
        this.idFibra = idFibra;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getNomeOlt() {
        return nomeOlt;
    }

    public void setNomeOlt(String nomeOlt) {
        this.nomeOlt = nomeOlt;
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

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getVlanVoip() {
        return vlanVoip;
    }

    public void setVlanVoip(Integer vlanVoip) {
        this.vlanVoip = vlanVoip;
    }

    public Integer getVlanUnicast() {
        return vlanUnicast;
    }

    public void setVlanUnicast(Integer vlanUnicast) {
        this.vlanUnicast = vlanUnicast;
    }

    public Integer getVlanMulticast() {
        return vlanMulticast;
    }

    public void setVlanMulticast(Integer vlanMulticast) {
        this.vlanMulticast = vlanMulticast;
    }

    public String getIdOnt() {
        return idOnt;
    }

    public void setIdOnt(String idOnt) {
        this.idOnt = idOnt;
    }

}
