package week2.objectmodeling;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void displayOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aayushi Agarwal");

        Product product1 = new Product("Product 1", 10.99);
        Product product2 = new Product("Product 2", 9.99);

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        customer1.placeOrder(order1);

        customer1.displayOrders();
    }
}
