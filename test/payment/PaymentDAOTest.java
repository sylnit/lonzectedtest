/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

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
public class PaymentDAOTest {
    
    public PaymentDAOTest() {
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
     * Test of savePayment method, of class PaymentDAO.
     */
    @Test
    public void testSavePayment() {
        System.out.println("savePayment");
        String[] args = new String[]{"transport booking", "2000", "Successful", "50"};
        PaymentDAO instance = new PaymentDAO();
        boolean expResult = true;
        boolean result = false;
        try{
            result = instance.savePayment(args);
        }catch(Exception e){
            e.printStackTrace();
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}