/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8a_group1;

/**
 *
 * @author maryam
 */
public class LoginProxy implements LogIn{
    
    SingleAdmin admin = SingleAdmin.GetAdmin();
    String username = admin.getUsername();
    String password = admin.getPassword();

    @Override
    public void LogIn(String username, String password) {
        if(username.equals(this.username)&& password.equals(this.password)){
            RealLogIn realLogin = new RealLogIn();
            realLogin.LogIn(username, password);
        }
        else{
            RealLogIn.logInStatus = "You are not authorized!";
        }
    }
    
}
