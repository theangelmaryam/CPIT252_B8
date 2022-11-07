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
public class CartItemClass {
    double price;
    String title;
    String auther;
    int year;

    public static ArrayList<CartItemClass> CartItemList = new ArrayList<CartItemClass>()  ;
    
    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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

    public CartItemClass(double price,String title) {
        this.price = price;
        this.title = title;
    }

    public CartItemClass(String title, String auther, int year, double price) {
        this.price = price;
        this.title = title;
        this.auther = auther;
        this.year = year;
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
