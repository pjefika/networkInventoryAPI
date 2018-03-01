/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import javax.persistence.Query;
import br.net.gvt.efika.networkInventoryAPI.model.entity.ExternalNetworkSigres;

public class ExternalNetworkSigresDAOImpl extends AbstractHibernateDAO implements ExternalNetworkSigresDAO {

    @Override
    public ExternalNetworkSigres consultar(String terminal) throws Exception {
        try {
            Query query = entity().createQuery("FROM ExternalNetworkSigres i "
                    + "WHERE "
                    + "i.terminal =:param1");
            query.setParameter("param1", terminal);
            return (ExternalNetworkSigres) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
