/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.Query;
import model.entity.NetworkInventorySigresFibra;

/**
 *
 * @author G0042204
 */
public class NetworkInventorySigresFibraDAO extends AbstractHibernateDAO implements
        EfikaCustomerInterface<NetworkInventorySigresFibra>, ConsultaVizinhanca<NetworkInventorySigresFibra> {
    
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
    
    @Override
    public List<NetworkInventorySigresFibra> consultarVizinhos(NetworkInventorySigresFibra inventory, Integer qtde) throws Exception {
        try {
            Query query = entity().createQuery("FROM NetworkInventorySigresFibra i "
                    + "WHERE "
                    + "("
                    + "i.nomeOlt =:param1 "
                    + "AND i.external.splitter1n =:param2 "
                    + "AND i.external.splitter2n =:param3 "
                    + ")");
            query.setParameter("param1", inventory.getNomeOlt());
            query.setParameter("param2", inventory.getExternal().getSplitter1n());
            query.setParameter("param3", inventory.getExternal().getSplitter2n());
            return (List<NetworkInventorySigresFibra>) query.setMaxResults(qtde).getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            this.close();
        }
    }
    
}
