/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "SA009_INVENTARIO_REDE_EXTERNA_VIVO1", schema = "dw_efika")
public class ExternalNetworkSigres implements Serializable {

    /**
     * SELECT `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`TERMINAL`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_CONJUGADO`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_DIGITO`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_CNL`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_AT`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_COD_LOGRADOURO`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_TIPO_ENDERECO`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_NOME_ENDERECO`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_NUM_ENDERECO`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_ATTENDANCE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERFIRSTLEVELCODE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERFIRSTLEVELADDRESS`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_DISTRIBUTIONLOWFIBER`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_DISTRIBUTIONHIGHFIBER`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_SPLITTERSECONDLEVELFIBERNUM`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERSECONDLEVELCODE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERSECONDLEVELADDRESS`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_LATERALCABLEDISTRIBUTION`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_TERMINALEQUIPMENTTYPE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_TERMINALEQUIPMENTADDRESS`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_OPTICATERMINAL`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`N_FIBERPORTNUM`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_TECHNOLOGY`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERFIRSTLEVELSTCODE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERFIRSTLEVELLOTFACE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERSECONDLEVELSTCODE`,
     * `SA009_INVENTARIO_REDE_EXTERNA_VIVO1`.`S_SPLITTERSECONDLEVELLOTFACE` FROM
     * `dw_efika`.`SA009_INVENTARIO_REDE_EXTERNA_VIVO1`; ;
     */
    @Id
    @Column(name = "TERMINAL")
    private String terminal;

    @Column(name = "S_SPLITTERFIRSTLEVELCODE")
    private String splitter1n;

    @Column(name = "S_SPLITTERSECONDLEVELCODE")
    private String splitter2n;

    @Column(name = "S_LATERALCABLEDISTRIBUTION")
    private String caboAlim;

    @Column(name = "N_DISTRIBUTIONLOWFIBER")
    private String fibra1n;

    @Column(name = "N_DISTRIBUTIONHIGHFIBER")
    private String fibra2n;

    public ExternalNetworkSigres() {
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
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
