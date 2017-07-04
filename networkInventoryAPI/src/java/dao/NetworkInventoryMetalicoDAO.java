/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.StoredProcedureQuery;
import model.entity.NetworkInventoryMetalico;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryMetalicoDAO extends AbstractHibernateDAO implements
        EfikaCustomerInterface<NetworkInventoryMetalico>,
        InterfaceDAO<NetworkInventoryMetalico> {

    public NetworkInventoryMetalicoDAO() {
        em = FactoryEntityManager.getInstance().createEntityManager();
    }

    @Override
    public NetworkInventoryMetalico consultarCliente(String param1) throws Exception {
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("GET_INVENTARIO_METALICO");
        query.setParameter("instancia", param1);
        query.execute();
//        Query query = em.createQuery("FROM NetworkInventoryMetalico i "
//                + "WHERE "
//                + "("
//                + "i.instancia =:param1 "
//                + "OR i.designador =:param1 "
//                + ")");
//        query.setParameter("param1", param1);
        return (NetworkInventoryMetalico) query.getSingleResult();
    }

}
