/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maryam
 */
public class Hayat implements BookAuthor{

    @Override
    public void addBook(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {
        try {
            Laibrarian.addBook(bookTitle, bookAuthor, bookYear, bookPrice);
        } catch (Exception ex) {
            Logger.getLogger(Hayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
