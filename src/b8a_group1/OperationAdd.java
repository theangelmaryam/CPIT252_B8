/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

/**
 *
 * @author maryam
 */
public class OperationAdd implements Strategy{

    @Override
    public Book doOperation(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {
        
                BookMaker bookMaker = new BookMaker();
                if(bookAuthor.equalsIgnoreCase("Hayat")){
                    bookMaker.addHayatBook(bookTitle, bookAuthor, bookYear, bookPrice);
                }
                else if(bookAuthor.equalsIgnoreCase("Rutanah")){
                    bookMaker.addRutanahBook(bookTitle, bookAuthor, bookYear, bookPrice);
                }
                else if(bookAuthor.equalsIgnoreCase("Maryam")){
                    bookMaker.addMaryamBook(bookTitle, bookAuthor, bookYear, bookPrice);                    
                }
                Book book = new Book();
                return book;
    
    }
    
}
