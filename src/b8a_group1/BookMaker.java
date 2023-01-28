/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

/**
 *
 * @author maryam
 */
public class BookMaker {
    private BookAuthor Hayat = new Hayat();
    private BookAuthor Rutanah = new Rutanah();
    private BookAuthor Maryam = new Maryam();


    public BookMaker() {
        Hayat = new Hayat();
        Rutanah = new Rutanah();
        Maryam = new Maryam();
    }
    public void addHayatBook(String bookTitle, String bookAuthor, int bookYear, double bookPrice){
                Hayat.addBook(bookTitle, bookAuthor, bookYear, bookPrice);
    }
    public void addRutanahBook(String bookTitle, String bookAuthor, int bookYear, double bookPrice){
                Rutanah.addBook(bookTitle, bookAuthor, bookYear, bookPrice);
    }
    public void addMaryamBook(String bookTitle, String bookAuthor, int bookYear, double bookPrice){
                Maryam.addBook(bookTitle, bookAuthor, bookYear, bookPrice);

    }
    
}
