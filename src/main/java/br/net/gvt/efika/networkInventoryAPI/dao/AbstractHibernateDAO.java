/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

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
        } catch (Exception e) {
        } finally {
            em = null;
        }
        try {
            emf.close();
        } catch (Exception e) {
        } finally {
            emf = null;
        }
    }

    public EntityManager entity() {
        if (em == null) {
            em = getEmf().createEntityManager();
        }
        return em;
    }

    protected EntityManagerFactory getEmf() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("networkInventoryPU");
        }
        return emf;
    }

}
