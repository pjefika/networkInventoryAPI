/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Query;
import model.entity.NetworkInventory;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryDAO extends AbstractHibernateDAO implements
        EfikaCustomerInterface {

    public NetworkInventoryDAO() {
        em = FactoryEntityManager.getInstance();
    }

    @Override
    public NetworkInventory consultarCliente(String param1) throws Exception {
        try {
            Query query = em.createQuery("FROM NetworkInventory i "
                    + "WHERE "
                    + "("
                    + "i.instancia =:param1 "
                    + "OR i.designador =:param1 "
                    + "OR i.designadorAcesso =:param1"
                    + ")");
            query.setParameter("param1", param1);
            return (NetworkInventory) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
