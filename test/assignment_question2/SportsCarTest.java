/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment_question2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ST10257468 - Bela Jyoti Premchund
 */
public class SportsCarTest {
    SportsCar sport = new SportsCar("Black", "Ford", "Mustang", 750000.00, 1970);
    /**
     * Test of getPrice method, of class SportsCar.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 750000.00;
        double result = sport.getPrice(expResult);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getYearProduced method, of class SportsCar.
     */
    @Test
    public void testGetYearProduced() {
        System.out.println("getYearProduced");
        int expResult = 1970;
        int result = sport.getYearProduced(expResult);
        assertEquals(expResult, result);
    }

    
}
