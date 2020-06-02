/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringaddition;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class StringAdditionTest {
    
    public StringAdditionTest() {
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

    @Test
    public void testSomeMethod() {
        StringAddition add = new StringAddition();
        int res = add.sum("");
        assertEquals(0,res); //empty string
        res = add.sum("1");
        assertEquals(1,res); //single number
        res = add.sum("1,2");
        assertEquals(3,res); //sum of two numbers
        res = add.sum("1 2");
        assertEquals(3,res); //sum of numbers separated by space
        res = add.sum("1,5,8 0,7");
        assertEquals(21,res); //sum of multiple numbers separated by space and commas
        res = add.sum("10,21");
        assertEquals(31,res);//sum of numbers greater than 10
        res = add.sum("1, 3  5,101 438, 34");
        assertEquals(582,res); //sum of numbers greater than or equal to zero
        res = add.sum("://23;\n100");
        assertEquals(123,res); //using combination of delimiters 
        res = add.sum(":1//23;\n100");
        assertEquals(124,res); //using combination of delimiters and more than two numbers 
    }
    
}
