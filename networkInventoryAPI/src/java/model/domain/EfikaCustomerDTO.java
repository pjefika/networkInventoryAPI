/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.OrigemPlanta;
import br.net.gvt.efika.customer.OrigemRede;
import br.net.gvt.efika.customer.TipoRede;
import javax.xml.bind.annotation.XmlRootElement;
import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventoryMetalico;
import model.entity.NetworkInventorySigresFibra;
import model.entity.OltDetailSigresFibra;

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
        r.setPlanta(OrigemPlanta.VIVO2);
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
    
    public EfikaCustomerDTO(NetworkInventorySigresFibra n, OltDetailSigresFibra detail) {
        this.setInstancia(n.getIdFibra());
        InventarioRede r = new InventarioRede();
        r.setPlanta(OrigemPlanta.VIVO1);
        r.setTipo(TipoRede.GPON);
        r.setOrigem(OrigemRede.OFFLINE);
        r.setIpDslam(detail.getIpOlt());
        r.setTerminal(n.getTerminal());
        
        r.setSlot(n.getSlot());
        r.setPorta(n.getPorta());
        r.setSequencial(n.getIdCliente());
        r.setLogica(n.getIdCliente());
        r.setRin(n.getRin());
        
        r.setVendorDslam(detail.getVendor());
        r.setModeloDslam(detail.getModel());
        r.setVlanVoip(n.getVlanVoip());
        r.setVlanVod(n.getVlanMulticast());
        r.setVlanMulticast(n.getVlanMulticast());
        r.setIdOnt(n.getIdOnt());
        r.setCvLan(n.getcVlan());
        r.setBhs(Boolean.TRUE);
        
        this.setRede(r);
    }
    
    public EfikaCustomerDTO(NetworkInventoryMetalico n) {
        
        this.setInstancia(n.getInstancia());
        this.setDesignador(n.getDesignador());
        
        InventarioRede r = new InventarioRede();
        r.setTipo(TipoRede.METALICA);
        r.setOrigem(OrigemRede.OFFLINE);
        r.setPlanta(OrigemPlanta.VIVO2);
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
