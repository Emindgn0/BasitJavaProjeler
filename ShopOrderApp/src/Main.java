public class Main {
    public static void main(String[] args) {
        Product product1= new Product("ayakkabı", 5000.0,101);
        Product product2= new Product("cüzdan", 1000.0,201);
        Product product3= new Product("çanta", 6000.0,301);
        Product product4= new Product("şort", 550.5,401);
        Customer customer1= new Customer("Emin",1);
        Customer customer2= new Customer("Yaren",2);
        Customer customer3= new Customer("Berat",3);
        Customer customer4= new Customer("Aleyna",4);
        Order order1=new Order("O1",customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product4);
        order1.displayOrderDetails();

    }
}
