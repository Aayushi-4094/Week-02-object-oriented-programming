package week2.encapsulation;
abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable {
    private double taxRate;
    public Electronics(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
    @Override
    public double calculateTax() {
        return getPrice() * taxRate / 100;
    }


    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + (getPrice() + calculateTax() - calculateDiscount()));
    }
}
class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }


    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + (getPrice() - calculateDiscount()));
    }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return 0;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + getPrice());
    }
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics(1, "Laptop", 50000, 10);
        products[1] = new Clothing(2, "Shirt", 1000);
        products[2] = new Groceries(3, "Rice", 500);
        for (Product product : products) {
            product.displayDetails();
            System.out.println();
     }
}
}
