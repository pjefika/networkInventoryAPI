/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.dao;

import br.net.gvt.efika.networkInventoryAPI.model.entity.NetworkInventorySigresMetalico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class NetworkInventorySigresMetalicoDAOIT {

    public NetworkInventorySigresMetalicoDAOIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of consultar method, of class NetworkInventorySigresMetalicoDAO.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        String param1 = "";
        NetworkInventorySigresMetalicoDAO instance = new NetworkInventorySigresMetalicoDAO();
        NetworkInventorySigresMetalico expResult = null;
        NetworkInventorySigresMetalico result = instance.consultar(param1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarDslam method, of class
     * NetworkInventorySigresMetalicoDAO.
     */
    @Test
    public void testConsultarDslam() throws Exception {
        try {
            System.out.println("consultarDslam");
            String nomeDslam = "BR_SPO_IP-ALC_DSL_21_00_01";
            NetworkInventorySigresMetalicoDAO instance = new NetworkInventorySigresMetalicoDAO();
            NetworkInventorySigresMetalico result = instance.consultarDslam(nomeDslam);
            assertTrue(!result.getNomeDslam().isEmpty());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
