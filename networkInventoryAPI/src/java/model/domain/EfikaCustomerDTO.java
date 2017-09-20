/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.OrigemRede;
import br.net.gvt.efika.customer.TipoRede;
import javax.xml.bind.annotation.XmlRootElement;
import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventoryMetalico;

/**
 *
 * @author G0042204
 */
@XmlRootElement(name = "cliente")
public class EfikaCustomerDTO extends EfikaCustomer {

    public EfikaCustomerDTO(NetworkInventoryGpon n) {

        this.setInstancia(n.getInstancia());
        this.setDesignador(n.getDesignador());
        this.setDesignadorAcesso(n.getDesignadorAcesso());

        InventarioRede r = new InventarioRede();
        r.setTipo(TipoRede.GPON);
        r.setOrigem(OrigemRede.OFFLINE);
        r.setIpDslam(n.getIpDslam());
        r.setVendorDslam(n.getVendorDslam());
        r.setModeloDslam(n.getModeloDslam());
        r.setSlot(n.getSlot());
        r.setPorta(n.getPorta());
        r.setSequencial(n.getSequencial());
        r.setLogica(n.getLogica());
        r.setRin(n.getRin());
        r.setVlanVoip(n.getVlanVoip());
        r.setVlanVod(n.getVlanVod());
        r.setVlanMulticast(n.getVlanMulticast());
        r.setCvLan(n.getCvLan());

        this.setRede(r);
    }

    public EfikaCustomerDTO(NetworkInventoryMetalico n) {

        this.setInstancia(n.getInstancia());
        this.setDesignador(n.getDesignador());

        InventarioRede r = new InventarioRede();
        r.setTipo(TipoRede.METALICA);
        r.setOrigem(OrigemRede.OFFLINE);
        r.setIpDslam(n.getIpDslam());
        r.setVendorDslam(n.getVendorDslam());
        r.setModeloDslam(n.getModeloDslam());
        r.setSlot(n.getSlot());
        r.setPorta(n.getPorta());
        r.setSequencial(n.getSequencial());
        r.setRin(n.getRin());
        r.setVlanVoip(n.getVlanVoip());
        r.setVlanVod(n.getVlanVod());
        r.setVlanMulticast(n.getVlanMulticast());

        if (n.getSequencial() != null) {
            r.setCvLan(n.getSequencial() + 100);
        }

        this.setRede(r);
    }

}
