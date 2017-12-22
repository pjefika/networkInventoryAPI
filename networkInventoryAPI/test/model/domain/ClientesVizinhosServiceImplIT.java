/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.entity.NetworkInventoryGpon;
import model.entity.NetworkInventorySigresFibra;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class ClientesVizinhosServiceImplIT {
    
    public ClientesVizinhosServiceImplIT() {
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
     * Test of consultar method, of class ClientesVizinhosServiceImpl.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        EfikaCustomer ec = null;
        Integer qtde = null;
        ClientesVizinhosServiceImpl instance = new ClientesVizinhosServiceImpl();
        ClientesVizinhosResponse expResult = null;
        ClientesVizinhosResponse result = instance.consultar(ec, qtde);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adapter method, of class ClientesVizinhosServiceImpl.
     */
    @Test
    public void testAdapter_NetworkInventoryGpon() {
        System.out.println("adapter");
        NetworkInventoryGpon inv = null;
        ClientesVizinhosServiceImpl instance = new ClientesVizinhosServiceImpl();
        EfikaCustomerDTO expResult = null;
        EfikaCustomerDTO result = instance.adapter(inv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adapter method, of class ClientesVizinhosServiceImpl.
     */
    @Test
    public void testAdapter_NetworkInventorySigresFibra() {
        System.out.println("adapter");
        NetworkInventorySigresFibra inv = null;
        ClientesVizinhosServiceImpl instance = new ClientesVizinhosServiceImpl();
        EfikaCustomerDTO expResult = null;
        EfikaCustomerDTO result = instance.adapter(inv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
