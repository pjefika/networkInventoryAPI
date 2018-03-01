/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import java.util.List;
import javax.persistence.Query;
import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventoryGpon;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryGponDAOImpl extends AbstractHibernateDAO implements NetworkInventoryGponDAO {

    public NetworkInventoryGponDAOImpl() {
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

    @Override
    public List<NetworkInventoryGpon> consultarVizinhos(NetworkInventoryGpon inv,  Integer qtde) throws Exception {
        try {
            return entity().createQuery("FROM NetworkInventoryGpon i "
                    + "WHERE 1=1 "
                    + "AND i.ipDslam =:param "
                    + "AND i.splSecundario =:param1 ")
                    .setParameter("param", inv.getIpDslam())
                    .setParameter("param1", inv.getSplitter2n())
                    .setMaxResults(qtde)
                    .getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }

}
