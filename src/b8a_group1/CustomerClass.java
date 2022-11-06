/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

/**
 *
 * @author PC
 */
public class CustomerClass extends User{
    String email;
    String phone_number;
    
    public CustomerClass( String first_name, String last_name, String phone_number){
    this.first_name = first_name;
    this.last_name = last_name;
    this.phone_number = phone_number;
    }
    
    
}