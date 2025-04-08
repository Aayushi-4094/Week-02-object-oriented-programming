package week2.classesObjects.level1;

import java.util.Scanner;

public class Item {
    long itemCode;
    String itemName;
    int price;

    public Item(long itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails(int quantity) {
        int totalCost = calculateTotal(price, quantity);
        System.out.println("The item code " + itemCode + " with item name as " + itemName + " and price " + price + " has total cost " + totalCost);
    }

    int calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of the item");
        long itemCode = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the item name");
        String itemName = sc.nextLine();
        System.out.println("Enter the price");
        int price = sc.nextInt();
        System.out.println("Enter the itemQuantity");
        int quantity = sc.nextInt();

        Item item = new Item(itemCode, itemName, price);
        item.displayDetails(quantity);
    }
}
