package b8a_group1;

public class InterfaceMaker {

    private Interface LibrarianInterface;
    private Interface CustomerInterface;

    public InterfaceMaker() {
        LibrarianInterface = new Librarian();
        CustomerInterface = new Customer();
    }

    public void displayLibrarianInterface() {
        LibrarianInterface.display();
    }

    public void displayCustomerInterface() {
        CustomerInterface.display();
    }

}
