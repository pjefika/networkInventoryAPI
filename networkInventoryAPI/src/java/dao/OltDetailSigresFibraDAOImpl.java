/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Query;
import model.entity.OltDetailSigresFibra;

/**
 *
 * @author G0042204
 */
public class OltDetailSigresFibraDAOImpl extends AbstractHibernateDAO implements OltDetailSigresFibraDAO {

    public OltDetailSigresFibraDAOImpl() {
    }

    @Override
    public OltDetailSigresFibra consultar(String param1) throws Exception {
        try {
            Query query = entity().createQuery("FROM OltDetailSigresFibra i "
                    + "WHERE "
                    + "i.nomeOlt =:param1");
            query.setParameter("param1", param1);
            return (OltDetailSigresFibra) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
