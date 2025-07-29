import java.util.ArrayList;

public class Product {
    private String name;
    private Double Price;
    private int productID;

    public Product(String name , Double Price , int productID){
        this.name=name;
        this.productID=productID;
        this.Price=Price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    public void displayProduct(){
        System.out.println("Product : " + name + " " + Price + " "+ productID );
    }
}
