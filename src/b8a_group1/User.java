/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import java.util.ArrayList;

/**
 *
 * @author reena
 */
public class User {
    String first_name;
    String last_name;
    String userName;
    String password;
    int ID;

    public User() {
        
    }

    
    public User(String first_name, String last_name, String userName, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.userName = userName;
        this.password = password;
    }
    
    public static Book search(String bookTitle){
        Book book = null;
        for (int i = 0; i < Book.bookList.size(); i++) {
                if (bookTitle.equalsIgnoreCase(Book.bookList.get(i).title)) {
                    book = Book.bookList.get(i);
            }
        }
        return book;
    }
    
}
