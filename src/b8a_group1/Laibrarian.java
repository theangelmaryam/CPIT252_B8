/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author reena
 */
public class Laibrarian extends User  {
        //public static File books = new File("Books");
        
        static Scanner read;
        static PrintWriter write;
   
    
    public Laibrarian() {
    
    }
    
    public static void addBook(String bookTitle, String bookAuthor, int bookYear, double bookPrice) throws Exception{
        // add book to the array list of books
        Book.bookList.add(new Book(bookTitle, bookAuthor, bookYear, bookPrice));
        
        
        // write the book info that was add to the file "db of books"
        write = new PrintWriter(new BufferedWriter(new FileWriter(Book.books, true)));
        write.println(bookTitle+" "+ bookAuthor+ " "+ bookYear + " "+ bookPrice);
        write.close();
    }

    
    public static Book deleteBook(int index)throws Exception{
        // remove the book from the array
        Book book = Book.bookList.get(index);
        Book.bookList.remove(index);
        
        // delete the book info from the file 
        File temp = new File("Temp");
        ArrayList<Book> tempArray = new ArrayList<Book> ();
        read = new Scanner(Book.books);
        
        
        while (read.hasNext()) {
            String titel = read.next();
            String auther = read.next();
            int yaer = read.nextInt();
            double price = read.nextDouble();
            Book currentBook = new Book(titel,auther,yaer,price);
            // check if the current book is not the book that we want to delete it, then add it to the tempArray
            if (!book.title.equalsIgnoreCase(book.title)) {
                tempArray.add(currentBook);
            }
        }
        // rewrite the file contect without deleted book
        write = new PrintWriter(new BufferedWriter(new FileWriter(Book.books, false)));
        for (int i = 0; i < tempArray.size(); i++) {
            write.println(tempArray.get(i).title + " "+tempArray.get(i).auther + " " + tempArray.get(i).year +" " + tempArray.get(i).price );
        }
        write.close();
        // return the deleted book 
        return book;
    }
}
