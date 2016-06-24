/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

import Utilities.TransportBooking;
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
public class TransportDAOTest {
    
    public TransportDAOTest() {
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
     * Test of bookTransport method, of class TransportDAO.
     */
    /*@Test
     void testBookTransport() {
        System.out.println("bookTransport");
        String[] args = null;
        TransportDAO instance = new TransportDAO();
        Integer expResult = null;
        Integer result = instance.bookTransport(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getBooking method, of class TransportDAO.
     */
    @Test
    public void testGetBooking() {
        System.out.println("getBooking");
        Integer bookingId = null;
        TransportDAO instance = new TransportDAO();
        TransportBooking expResult = null;
        TransportBooking result = instance.getBooking(32);
        System.out.println(result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}