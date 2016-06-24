/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAM
 */
public class TransactionDAOTest {
    
    public TransactionDAOTest() {
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
     * Test of generateTransactionId method, of class TransactionDAO.
     */
    @Test
    public void testGenerateTransactionId() {
        System.out.println("generateTransactionId");
        String transType = "";
        Integer userId = null;
        TransactionDAO instance = new TransactionDAO();
        String expResult = "";
        String result = instance.generateTransactionId(transType, userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}