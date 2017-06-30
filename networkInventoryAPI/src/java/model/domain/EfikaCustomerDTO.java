/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import javax.xml.bind.annotation.XmlRootElement;
import model.entity.NetworkInventory;

/**
 *
 * @author G0042204
 */
@XmlRootElement(name = "cliente")
public class EfikaCustomerDTO extends EfikaCustomer {

    public EfikaCustomerDTO(NetworkInventory n) {

        this.setInstancia(n.getInstancia());
        this.setDesignador(n.getDesignador());
        this.setDesignadorAcesso(n.getDesignadorAcesso());

        InventarioRede r = new InventarioRede();
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
        this.setRede(r);
    }

}
