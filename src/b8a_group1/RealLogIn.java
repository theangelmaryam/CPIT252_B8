package b8a_group1;

public class RealLogIn implements LogIn {

    static String logInStatus;

    @Override
    public void LogIn(String username, String password) {
        logInStatus = "You are logged in successfully!";
    }

}
