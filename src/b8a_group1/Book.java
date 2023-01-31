package b8a_group1;

import static b8a_group1.LibrarianOperation.read;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    public static ArrayList<Book> bookList = new ArrayList<Book>();
    String title;
    String auther;
    int year;
    double price;

    public static File books = new File("Books");
    static Scanner read;

    public Book() {
    }

    public Book(String title, String auther, int year, double price) {
        this.title = title;
        this.auther = auther;
        this.year = year;
        this.price = price;

    }

    public static void initilizBookList() throws FileNotFoundException {
        read = new Scanner(books);
        if (Book.bookList.isEmpty()) {
            while (read.hasNext()) {
                String titel = read.next().replaceAll("_", " ");
                String aut = read.next().replaceAll("_", " ");
                int yaer = read.nextInt();
                double pri = read.nextDouble();
                bookList.add(new Book(titel, aut, yaer, pri));
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
        return String.format("%s,%s,%d,%.2f", title, auther, year, price);
    }
}
