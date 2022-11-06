/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

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
public class UserTest {
    
    public UserTest() {
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
     * Test of search method, of class User.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String bookTitle = "And Then There Were None";
        ArrayList<Book> array = new ArrayList<Book>();
        Book book = new Book("And Then There Were None","Agatha Christie",1939,41.0);
        array.add(book);
        Book expResult = book;
        Book result = User.search(bookTitle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Buy method, of class User.
     */
    @Test
    public void testBuy() {
        System.out.println("Buy");
        ArrayList<CartItemClass> CartItemList = new ArrayList<CartItemClass>();
        User user = new User("mona","alasami" ,"056435678");
        StringBuilder Payment = new StringBuilder();

        String expResult = null ;
        String result = User.Buy(CartItemList, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
