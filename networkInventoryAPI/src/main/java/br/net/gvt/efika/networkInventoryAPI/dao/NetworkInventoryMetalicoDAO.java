/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import javax.persistence.StoredProcedureQuery;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventoryMetalico;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryMetalicoDAO extends AbstractHibernateDAO implements
        EfikaCustomerInterface<NetworkInventoryMetalico>,
        InterfaceDAO<NetworkInventoryMetalico> {

    public NetworkInventoryMetalicoDAO() {
    }

    @Override
    public NetworkInventoryMetalico consultarCliente(String param1) throws Exception {
        try {
            StoredProcedureQuery query = entity().createNamedStoredProcedureQuery("GET_INVENTARIO_METALICO");
            query.setParameter("instancia", param1);
            query.execute();
            return (NetworkInventoryMetalico) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
