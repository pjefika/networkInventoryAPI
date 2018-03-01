/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.model.domain;

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
public class ConsultaFacadeIT {

    public ConsultaFacadeIT() {
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
     * Test of consultar method, of class ConsultaFacade.
     */
    @Test
    public void testConsultar() throws Exception {
        String instancia = "4130222839";
        CustomerServiceImpl instance = new CustomerServiceImpl();
        EfikaCustomerDTO result = instance.consultar(instancia);
        System.out.println("end");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
