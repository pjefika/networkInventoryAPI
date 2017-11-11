/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import model.entity.NetworkInventoryMetalico;
import model.entity.NetworkInventorySigresFibra;

/**
 *
 * @author G0042204
 */
public class NetworkInventorySigresFibraDAO extends AbstractHibernateDAO implements
        EfikaCustomerInterface<NetworkInventorySigresFibra> {

    public NetworkInventorySigresFibraDAO() {
    }

    @Override
    public NetworkInventorySigresFibra consultarCliente(String param1) throws Exception {
        try {
            Query query = entity().createQuery("FROM NetworkInventorySigresFibra i "
                    + "WHERE "
                    + "("
                    + "i.idFibra =:param1 "
                    + "OR i.terminal =:param1 "
                    + ")");
            query.setParameter("param1", param1);
            return (NetworkInventorySigresFibra) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
