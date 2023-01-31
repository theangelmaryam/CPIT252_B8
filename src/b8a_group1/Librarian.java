package b8a_group1;

public class Librarian implements Interface {

    @Override
    public void display() {
        SignUpInterface signup = null;
        if (signup == null) {
            signup = new SignUpInterface();
        }
        signup.setVisible(true);
    }

}
