import java.util.ArrayList;

public class Order {
    private Customer customer;
    private String orderStatus;
    private Double total = 0.0;
    private String orderID;
    private ArrayList<Product> products;

    public Order(String orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double totalPrice() {
        double sum = 0.0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        this.total = sum;
        return total;
    }

    // Getter ve setter'lar
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getTotalPrice() {
        return total;
    }

    public void setTotalPrice(Double total) {
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName() + " (ID: " + customer.getCID() + ")");
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Products in the order:");

        for (Product product : products) {
            System.out.println(" - " + product.getName() + " | Price: " + product.getPrice() + " | ID: " + product.getProductID());
        }

        System.out.println("Total Price: " + totalPrice());
    }

}
