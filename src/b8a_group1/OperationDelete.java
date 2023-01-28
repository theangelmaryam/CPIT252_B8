/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

import static b8a_group1.CustomerInterface.dtm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maryam
 */
public class OperationDelete implements Strategy{

    @Override
    public Book doOperation(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {
        return DeleteOperation();
        
    }
    
    public Book DeleteOperation(){
//            dtm.removeRow(LibrarianInterface.row);
//            Book book = null;
//            try {
                
        Book book = null;        
        try {
           book = Laibrarian.deleteBook(LibrarianInterface.row);
        } catch (Exception ex) {
            Logger.getLogger(OperationDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
//            } catch (Exception ex) {
//                Logger.getLogger(LibrarianInterface.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            dtm.setRowCount(0);//reset table and populate again with bookList
//            for (int i = 0; i < Book.bookList.size(); i++) {
//                Object[] objs = {Book.bookList.get(i).title, Book.bookList.get(i).auther, Book.bookList.get(i).year, Book.bookList.get(i).price};
//                dtm.addRow(objs);
//            }
//            dtm.removeRow(LibrarianInterface.row);
//            Book book = null;
//            try {
//            book = Laibrarian.deleteBook(LibrarianInterface.row);
//            } catch (Exception ex) {
//                Logger.getLogger(LibrarianInterface.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            dtm.setRowCount(0);//reset table and populate again with bookList
//            for (int i = 0; i < Book.bookList.size(); i++) {
//                Object[] objs = {Book.bookList.get(i).title, Book.bookList.get(i).auther, Book.bookList.get(i).year, Book.bookList.get(i).price};
//                dtm.addRow(objs);
//            }
            return book;
            
    }
    
    
}
