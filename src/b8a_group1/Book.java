/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;


import static b8a_group1.Laibrarian.read;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Book {
    public static ArrayList<Book> bookList =  new ArrayList<Book>();
    String title;
    String auther;
    int year;
    double price;
    //static ArrayList<Book> bookList = new ArrayList<>();
    
    public static File books = new File("Books");
    static Scanner read;
    
    public Book() {}
    
    public Book( String title, String auther, int year, double price){
        this.title = title;
        this.auther = auther;
        this.year = year;
        this.price = price;
        
        
        //read = new Scanner(books);
        /**while (read.hasNext()) {
            String titel = read.next();
            String aut = read.next();
            int yaer = read.nextInt();
            double pri = read.nextDouble();
            bookList.add(new Book(titel,aut,yaer,pri));
        }**/
    }
    
    public static void initilizBookList() throws FileNotFoundException{
        read = new Scanner(books);
        if (Book.bookList.isEmpty()) {
            while (read.hasNext()) {
                String titel = read.next().replaceAll("_", " ");
                String aut = read.next().replaceAll("_", " ");
                int yaer = read.nextInt();
                double pri = read.nextDouble();
                bookList.add(new Book(titel,aut,yaer,pri));
            }
        }
    }
    
    
    public static boolean isAvailable(String bookTitle) {
        boolean approvol = false;
        if (bookList.isEmpty()) {
            approvol = false;
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookTitle.equalsIgnoreCase(bookList.get(i).title)) {
                    approvol = true;
                } 
            }
        }
        return approvol;
    }


    
    @Override 
    public String toString() { 
        return String.format("%s,%s,%d,%.2f",title,auther,year,price); 
    }
//    public String toString() {
//        return "Book Title: " + this.title + ", Book Author: " + this.auther + ", Publish Year: " + this.year
//                + ", Price: " + this.price;
//    }
}
