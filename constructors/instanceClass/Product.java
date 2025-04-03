package constructors.instanceClass;

public class Product {
    String productName;
    int price;
    static int totalProducts;


    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product price: " + price);

    }
    void displayTotalProducts(){
    System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Dress", 78);
        p1.displayProductDetails();
        p1.displayTotalProducts();
    }
}
