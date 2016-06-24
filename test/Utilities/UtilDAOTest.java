/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.util.List;
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
public class UtilDAOTest {
    
    public UtilDAOTest() {
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
     * Test of getDestinations method, of class UtilDAO.
     */
    @Test
    public void testGetDestinations() {
        System.out.println("getDestinations");
        UtilDAO instance = new UtilDAO();
        List expResult = null;
        List<Destination> result = instance.getDestinations();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimes method, of class UtilDAO.
     */
    @Test
    public void testGetTimes() {
        System.out.println("getTimes");
        UtilDAO instance = new UtilDAO();
        List expResult = null;
        List<Dtime> result = instance.getTimes();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVisitDates method, of class UtilDAO.
     */
    @Test
    public void testGetVisitDates() {
        System.out.println("getVisitDates");
        UtilDAO instance = new UtilDAO();
        List expResult = null;
        List result = instance.getVisitDates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisitTimes method, of class UtilDAO.
     */
    @Test
    public void testGetVisitTimes() {
        System.out.println("getVisitTimes");
        UtilDAO instance = new UtilDAO();
        List expResult = null;
        List result = instance.getVisitTimes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class UtilDAO.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        UtilDAO instance = new UtilDAO();
        List expResult = null;
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubpacks method, of class UtilDAO.
     */
    @Test
    public void testGetSubpacks() {
        System.out.println("getSubpacks");
        UtilDAO instance = new UtilDAO();
        List expResult = null;
        List result = instance.getSubpacks();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}