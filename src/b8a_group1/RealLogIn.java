/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

/**
 *
 * @author maryam
 */
public class RealLogIn implements LogIn{
    static String logInStatus; 
    @Override
    public void LogIn(String username, String password) {
        logInStatus = "You are logged in successfully!";
    }
    
    
}
