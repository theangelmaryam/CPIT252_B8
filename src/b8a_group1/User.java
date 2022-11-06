/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author reena
 */
public class User {
    String first_name;
    String last_name;
    String userName;
    String password;
    String phone_no;
    int ID;
    

    public User() {
        
    }

    
    public User(String first_name, String last_name , String phone_no) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.userName = userName;
        this.password = password;
        this.phone_no = phone_no ;
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
    public static String Buy(ArrayList<CartItemClass>CartItemList,User user){
        StringBuilder Payment = new StringBuilder();
        
        Date oj = new Date() ;
        String date = oj.toString() ; 
             Payment.append(date);
        Payment.append("\n");

        Payment.append("================================= \n");
            Payment.append("             Welcome To Books Store  \n");
            Payment.append("================================= \n");
        Payment.append("Selected Books:");

            for (int i = 0; i < CartItemList.size(); i++) {
                Payment.append(CartItemList.get(i).title + "\t");

            }
             
            Payment.append("\n");
            Payment.append("TotalPrice:" + CartItemClass.calculateTotalPrice(CartItemList) + "\n");
            Payment.append("\n");
            Payment.append("Customer Information : \n");
            Payment.append("FirstName:" + user.first_name + "\n");
            Payment.append("LastName:" + user.last_name+ "\n");
            Payment.append("Phone Number:" + user.phone_no+"\n");
            CartItemList.clear();
            Payment.append("================================= \n");
            Payment.append("              Thank you  \n");
            Payment.append("================================= \n");

            return Payment.toString();
        
    }
    
}
