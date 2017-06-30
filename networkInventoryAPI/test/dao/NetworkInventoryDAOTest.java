/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.entity.NetworkInventory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryDAOTest {

    public NetworkInventoryDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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
     * Test of consultarCliente method, of class NetworkInventoryDAO.
     */
    @Test
    public void testConsultarCliente() throws Exception {

        try {
            String param1 = "6239812027";
            EfikaCustomerInterface instance = new NetworkInventoryDAO();
            NetworkInventory result = instance.consultarCliente(param1);
            assertFalse(result.getInstancia().isEmpty());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
