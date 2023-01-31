package b8a_group1;

import java.util.ArrayList;
import java.util.Date;

public class CustomerClass extends User {

    String email;
    String phone_number;
    static boolean successfulPayment = false;

    public CustomerClass(String first_name, String last_name, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
    }

    public CustomerClass() {
    }

    public static String Buy(ArrayList<CartItemClass> CartItemList, CustomerClass user) {

        StringBuilder Payment = new StringBuilder();
        Date oj = new Date();
        String date = oj.toString();
        Payment.append(date + "\n" + "=================================\n" + "              Welcome To Books Store\n" + "=================================\n");

        Payment.append("Selected Books:\n");

        for (int i = 0; i < CartItemList.size(); i++) {
            Payment.append(CartItemList.get(i).title + "\n");

        }

        Payment.append("TotalPrice: " + CartItemClass.calculateTotalPrice(CartItemList) + "\n\n" + "Customer Information : \n");
        Payment.append("LastName: " + user.last_name + " FirstName: " + user.first_name + "\n" + "\n" + "Phone Number: " + user.phone_number + "\n");

        CartItemList.clear();
        Payment.append("=================================\n" + "              Thank you  \n" + "=================================\n");
        successfulPayment = true;
        return Payment.toString();

    }

}
