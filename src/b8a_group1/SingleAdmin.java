/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

/**
 *
 * @author maryam
 */
public class SingleAdmin {
    
    private static SingleAdmin Admin;
    private String username;
    private String password;

    public SingleAdmin() {
    }

    private SingleAdmin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public static SingleAdmin GetAdmin(){
        if(Admin == null){
        Admin = new SingleAdmin();
        }
        return Admin;
    }
    
    public static SingleAdmin GetAdmin(String username, String password){
        if(Admin == null){
        Admin = new SingleAdmin(username, password);
        }
        return Admin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
