/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author G0042204
 */
public class AbstractHibernateDAO {

    private EntityManager em;

    private EntityManagerFactory emf;

    public void close() {
        try {
            em.close();
            emf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public EntityManager entity() {
        if (em == null) {
            emf = Persistence.createEntityManagerFactory("networkInventoryPU");
            em = emf.createEntityManager();
        }
        return em;
    }

}
