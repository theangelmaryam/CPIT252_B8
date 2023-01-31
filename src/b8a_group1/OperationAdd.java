package b8a_group1;

import static b8a_group1.LibrarianOperation.write;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationAdd implements Strategy {

    @Override
    public Book doOperation(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {

        try {
            // add book to the array list of books
            Book.bookList.add(new Book(bookTitle, bookAuthor, bookYear, bookPrice));

            // write the book info that was add to the file "db of books"
            write = new PrintWriter(new BufferedWriter(new FileWriter(Book.books, true)));
            write.println(bookTitle.replaceAll(" ", "_") + " " + bookAuthor.replaceAll(" ", "_") + " " + bookYear + " " + bookPrice);
            write.close();
        } catch (Exception ex) {
            Logger.getLogger(OperationAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
