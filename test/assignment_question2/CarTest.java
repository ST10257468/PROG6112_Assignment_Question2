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
public class CarTest {
    Car car = new Car("Black", "Ford", "Mustang");
    
    /**
     * Test of getColour method, of class Car.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        String expResult = "Black";
        String result = car.getColour(expResult);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMake method, of class Car.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        String expResult = "Ford";
        String result = car.getMake(expResult);
        assertEquals(expResult, result);
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        String expResult = "Mustang";
        String result = car.getModel(expResult);
        assertEquals(expResult, result);
    }

    
}
