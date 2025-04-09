package week2.encapsulation;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + additionalCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Non-Veg Item";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Burger", 100, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 150, 2, 20);

        System.out.println(vegItem.getItemDetails());
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());

        System.out.println(nonVegItem.getItemDetails());
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
        if (nonVegItem instanceof Discountable) {
            Discountable discountableItem = (Discountable) nonVegItem;
            System.out.println("Discount: " + discountableItem.applyDiscount());
            System.out.println(discountableItem.getDiscountDetails());
     }
}
}
