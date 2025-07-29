public class Customer {
    private String name;
    private int customerID;

    public Customer(String name , int customerID){
        this.name=name;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCID() {
        return customerID;
    }

    public void setCID(int cID) {
        this.customerID = cID;
    }
    public void displayCustomer(){
        System.out.println("Customer : " + name + " "  + customerID);
    }
    @Override
    public String toString() {
        return "Customer{name='" + name + "', customerID=" + customerID + "}";
    }
}
