package staticfinalthis;

public class Product {
    public static double discount = 0.0;
    public static double updateDiscount(double newDiscount) {
        discount = newDiscount;
        return discount;
    }

    public final int productID;
    public String productName;
    public double price;
    public int quantity;
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product product = new Product(1, "Food syrup", 100.0, 10);
        if (product instanceof Product) {
            System.out.println("Product created: " + product.productName);
            product.displayDetails();
        }
        double newDiscount = 10.0;
        double updatedDiscount = updateDiscount(newDiscount);
        System.out.println("Updated Discount: " + updatedDiscount + "%");

        product.displayDetails();
}
}
