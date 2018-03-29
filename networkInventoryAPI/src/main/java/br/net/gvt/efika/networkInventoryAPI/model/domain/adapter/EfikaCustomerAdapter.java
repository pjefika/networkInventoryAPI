/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.model.domain.adapter;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRedeExterna;
import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemPlanta;
import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemRede;
import br.net.gvt.efika.efika_customer.model.customer.enums.TipoRede;
import br.net.gvt.efika.networkInventoryAPI.model.entity.ExternalNetworkSigres;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventoryGpon;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventoryMetalico;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventorySigresFibra;
import br.net.gvt.efika.networkInventoryAPI.model.entity.OltDetailSigresFibra;

/**
 *
 * @author G0042204
 */
public class EfikaCustomerAdapter {

    public static EfikaCustomer adapter(NetworkInventoryGpon n) {

        EfikaCustomer cst = new EfikaCustomer();
        cst.setInstancia(n.getInstancia());
        cst.setDesignador(n.getDesignador());
        cst.setDesignadorAcesso(n.getDesignadorAcesso());

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
        r.setCvlan(n.getCvLan());

        cst.setRede(r);

        InventarioRedeExterna ext = new InventarioRedeExterna();
        ext.setTipo(TipoRede.GPON);
        ext.setOrigem(OrigemRede.OFFLINE);
        ext.setFibra1n(n.getFibra1n());
        ext.setFibra2n(n.getFibra2n());
        ext.setCaboAlim(n.getCaboAlim());
        ext.setSplitter1n(n.getSplitter1n());
        ext.setSplitter2n(n.getSplitter2n());
        cst.setRedeExterna(ext);

        return cst;
    }

    public static EfikaCustomer adapter(NetworkInventorySigresFibra n, OltDetailSigresFibra detail, ExternalNetworkSigres sagre) {
        EfikaCustomer cst = new EfikaCustomer();

        cst.setInstancia(n.getIdFibra());
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
        if (n.getVlanVoip() == null) {
            r.setVlanVoip(n.getVlanMulticast() + 3);
        }

        r.setVlanVod(n.getVlanMulticast());
        r.setVlanMulticast(n.getVlanMulticast());
        r.setIdOnt(n.getIdOnt());
        r.setCvlan(n.getcVlan());
        r.setBhs(Boolean.TRUE);

        cst.setRede(r);

        if (sagre != null) {
            InventarioRedeExterna ext = new InventarioRedeExterna();
            ext.setTipo(TipoRede.GPON);
            ext.setOrigem(OrigemRede.OFFLINE);
            ext.setFibra1n(sagre.getFibra1n());
            ext.setFibra2n(sagre.getFibra2n());
            ext.setCaboAlim(sagre.getCaboAlim());
            ext.setSplitter1n(sagre.getSplitter1n());
            ext.setSplitter2n(sagre.getSplitter2n());
            cst.setRedeExterna(ext);
        }

        return cst;
    }

    public static EfikaCustomer adapter(NetworkInventorySigresFibra n) {
        EfikaCustomer cust = new EfikaCustomer();
        OltDetailSigresFibra detail = n.getDetailOlt();

        cust.setInstancia(n.getIdFibra());
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
        if (n.getVlanVoip() == null) {
            r.setVlanVoip(n.getVlanMulticast() + 3);
        }

        r.setVlanVod(n.getVlanMulticast());
        r.setVlanMulticast(n.getVlanMulticast());
        r.setIdOnt(n.getIdOnt());
        r.setCvlan(n.getcVlan());
        r.setBhs(Boolean.TRUE);

        cust.setRede(r);

        if (n.getExternal() != null) {
            InventarioRedeExterna ext = new InventarioRedeExterna();
            ext.setTipo(TipoRede.GPON);
            ext.setOrigem(OrigemRede.OFFLINE);
            ext.setFibra1n(n.getExternal().getFibra1n());
            ext.setFibra2n(n.getExternal().getFibra2n());
            ext.setCaboAlim(n.getExternal().getCaboAlim());
            ext.setSplitter1n(n.getExternal().getSplitter1n());
            ext.setSplitter2n(n.getExternal().getSplitter2n());
            cust.setRedeExterna(ext);
        }

        return cust;

    }

    public static EfikaCustomer adapter(NetworkInventoryMetalico n) {
        EfikaCustomer cust = new EfikaCustomer();

        cust.setInstancia(n.getInstancia());
        cust.setDesignador(n.getDesignador());

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
            r.setCvlan(n.getSequencial() + 100);
        }

        cust.setRede(r);

        return cust;
    }

}
