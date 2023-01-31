package b8a_group1;

public class Customer implements Interface {

    @Override
    public void display() {
        CustomerInterface customer = null;
        if (customer == null) {
            customer = new CustomerInterface();
        }

        customer.setVisible(true);
    }

}
