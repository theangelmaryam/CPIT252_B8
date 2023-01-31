package b8a_group1;

import static b8a_group1.CustomerInterface.dtm;
import static b8a_group1.LibrarianInterface.dtm;
import static b8a_group1.LibrarianInterface.row;
import static b8a_group1.LibrarianOperation.read;
import static b8a_group1.LibrarianOperation.write;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OperationDelete implements Strategy {

    @Override
    public Book doOperation(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {
//        // remove the book from the array
        Book book = new Book(bookTitle, bookAuthor, bookYear, bookPrice);
        // Book book = Book.bookList.get(index);
        for (int i = 0; i < Book.bookList.size(); i++) {
            if (Book.bookList.get(i).title.equals(bookTitle)) {
                Book.bookList.remove(i);
            }
        }

        // delete the book info from the file 
        File temp = new File("Temp");
        ArrayList<Book> tempArray = new ArrayList<Book>();
        try {
            read = new Scanner(Book.books);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OperationDelete.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (read.hasNext()) {
            String titel = read.next();
            String auther = read.next();
            int yaer = read.nextInt();
            double price = read.nextDouble();
            Book currentBook = new Book(titel, auther, yaer, price);
            // check if the current book is not the book that we want to delete it, then add it to the tempArray
            if (!currentBook.title.equalsIgnoreCase(book.title)) {
                tempArray.add(currentBook);
            }
        }
        try {
            // rewrite the file contect without deleted book
            write = new PrintWriter(new BufferedWriter(new FileWriter(Book.books, false)));
        } catch (IOException ex) {
            Logger.getLogger(OperationDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < tempArray.size(); i++) {
            write.println(tempArray.get(i).title + " " + tempArray.get(i).auther + " " + tempArray.get(i).year + " " + tempArray.get(i).price);
        }
        write.close();
        // return the deleted book 
        return book;

    }

}
