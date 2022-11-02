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
import org.junit.Ignore;

/**
 *
 * @author xhyat
 */
public class BookClassTest {
    
    public BookClassTest() {
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
     * Test of addBook method, of class BookClass.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String title = "And Then There Were None";
        String author = "Agatha Christie";
        int year = 1939;
        double price = 41.0;
        BookClass instance = new BookClass(title, author, year, price);
        String result = instance.toString();
        String expResult = "Book Title: And Then There Were None Book Author: Agatha Christie Publish Year: 1939 Price: 41.0";
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkBook method, of class BookClass.
     */
    @Ignore
    @Test
    public void testCheckBook() {
        System.out.println("checkBook");
        String bookTitle = "";
        ArrayList<BookClass> array = null;
        boolean expResult = false;
        boolean result = BookClass.checkBook(bookTitle, array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
