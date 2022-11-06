/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import java.util.ArrayList;

/**
 *
 * @author Mona
 */
public class CartItemClass {
   double price;
   String title;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CartItemClass(double price, String title) {
        this.price = price;
        this.title = title;
    }
    
   public static boolean checkCartItemEixsts(String bookTitle, ArrayList<CartItemClass>array){
        boolean isEixts = false;
        if (array.isEmpty()) {
            isEixts = true;
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (bookTitle.equals(array.get(i).title)) {
                    isEixts = false;
                } else {
                    isEixts = true;
                }
            }
        }
        return isEixts;
    }
   public static double calculateTotalPrice(ArrayList<CartItemClass>array){
       double total=0.0;
       for (int i = 0; i < array.size(); i++) {
             total += array.get(i).price;
           
       }
       return total;
   }
    
}

