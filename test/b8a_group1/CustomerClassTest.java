/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import static b8a_group1.CartItemClass.CartItemList;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reena
 */
public class CustomerClassTest {
    
    public CustomerClassTest() {
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
     * Test of Buy method, of class CustomerClass.
     */
    @Test
    public void testBuy() {
        System.out.println("Buy");
        double price = 100.0 ;
        String title = "And Then There Were None";
        CartItemClass instance = new CartItemClass(price,title);
        CartItemList.add(instance);
        CustomerClass user = new CustomerClass("mona","alasami" ,"056435678"); 
        CustomerClass.Buy(CartItemList, user);
        boolean expResult = true;
        boolean result = CustomerClass.successfulPayment; 
        assertEquals(expResult, result);
    }
    
}
