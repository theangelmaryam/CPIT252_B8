package b8a_group1;

public class SingleAdmin {

    private static SingleAdmin Admin;
    private String username;
    private String password;

    private SingleAdmin() {
    }

    private SingleAdmin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SingleAdmin GetAdmin() {
        if (Admin == null) {
            Admin = new SingleAdmin();
        }
        return Admin;
    }

    public static SingleAdmin GetAdmin(String username, String password) {
        if (Admin == null) {
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
