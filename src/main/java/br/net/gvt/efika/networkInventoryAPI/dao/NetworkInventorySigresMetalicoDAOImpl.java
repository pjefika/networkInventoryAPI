/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import javax.persistence.Query;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventorySigresMetalico;

/**
 *
 * @author G0042204
 */
public class NetworkInventorySigresMetalicoDAOImpl extends AbstractHibernateDAO implements NetworkInventorySigresMetalicoDAO {

    public NetworkInventorySigresMetalicoDAOImpl() {
    }

    @Override
    public NetworkInventorySigresMetalico consultar(String param1) throws Exception {
        try {
            Query query = entity().createQuery("FROM NetworkInventorySigresMetalico i "
                    + "WHERE "
                    + "("
                    + "i.nrc =:param1 "
                    + "OR i.terminal =:param1 "
                    + ")");
            query.setParameter("param1", param1);
            return (NetworkInventorySigresMetalico) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

    @Override
    public NetworkInventorySigresMetalico consultarDslamDetail(String nomeDslam) throws Exception {
        try {
            Query query = entity().createQuery("FROM NetworkInventorySigresMetalico i WHERE i.nomeDslam =:param1");
            query.setParameter("param1", nomeDslam);
            query.setMaxResults(1);
            return (NetworkInventorySigresMetalico) query.getSingleResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
