/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Query;
import model.entity.NetworkInventoryGpon;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryGponDAO extends AbstractHibernateDAO implements
        EfikaCustomerInterface<NetworkInventoryGpon> {

    public NetworkInventoryGponDAO() {
    }

    @Override
    public NetworkInventoryGpon consultarCliente(String param1) throws Exception {
        try {
            Query query = entity().createQuery("FROM NetworkInventoryGpon i "
                    + "WHERE "
                    + "("
                    + "i.instancia =:param1 "
                    + "OR i.designador =:param1 "
                    + "OR i.designadorAcesso =:param1"
                    + ")");
            query.setParameter("param1", param1);
            return (NetworkInventoryGpon) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
