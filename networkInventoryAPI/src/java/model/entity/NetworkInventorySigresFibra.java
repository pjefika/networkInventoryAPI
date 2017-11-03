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

    @Id
    @Column(name = "INSTANCIA")
    private String instancia;

    @Column(name = "NRO_TELEFONE15")
    private String idFibra;

    @Column(name = "NRC")
    private String nrc;

    // Rede
    @Column(name = "ENDIP_OLT")
    private String ipDslam;

    @Column(name = "VENDOR_OLT")
    private String vendorDslam;

    @Column(name = "MODEL_OLT")
    private String modeloDslam;

    @Column(name = "SLOT_OLT")
    private Integer slot;

    @Column(name = "PORTA_OLT")
    private Integer porta;

    @Column(name = "porta_sequencial")
    private Integer sequencial;

    @Column(name = "RIN")
    private Integer rin;

    @Column(name = "SLID")
    private String idOnt;

    @Column(name = "vlan_voip")
    private Integer vlanVoip;

    @Column(name = "vlan_vod")
    private Integer vlanVod;

    @Column(name = "vlan_mcast")
    private Integer vlanMulticast;

    public NetworkInventorySigresFibra() {
    }


}
