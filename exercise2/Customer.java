import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String address;
    private  int customerID;
    private static int counter;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email, String number, String hashedPassword, String address) {
        super(name, email, number, hashedPassword);
        this.address = address;
        this.customerID = counter++;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }


}
