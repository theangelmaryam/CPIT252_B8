/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BookClass {
    String title;
    String auther;
    int year;
    double price;
    
    public BookClass( String title, String auther, int year, double price){
        this.title = title;
        this.auther = auther;
        this.year = year;
        this.price = price;
    }
    public static BookClass addBook(String title, String author, int year, double price){
        BookClass book = new BookClass(title, author, year, price);
        return book;
    }
    
    public static BookClass deleteBook(BookClass book){
        book=null;
        return book;
    }
    
    public static boolean checkBook(String bookTitle, ArrayList<BookClass> array) {
        boolean approvol = false;
        if (array.isEmpty()) {
            approvol = true;
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (bookTitle.equalsIgnoreCase(array.get(i).title)) {
                    approvol = false;
                } else {
                    approvol = true;
                }
            }
        }
        return approvol;
    }
    
    public String toString() {
        return "Book Title: " + this.title + " Book Author: " + this.auther + " Publish Year: " + this.year
                + " Price: " + this.price;
    }
}
