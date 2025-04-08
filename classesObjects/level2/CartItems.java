package week2.classesObjects.level2;

import java.util.Scanner;

public class CartItems {
    int price;
    String itemName;
    int quantity;

    CartItems(int price, String itemName, int quantity) {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void addItem(int price, String itemName, int quantity) {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
        System.out.println(itemName + " added to cart.");
    }

    public void removeItem() {
        this.price = 0;
        this.itemName = "";
        this.quantity = 0;
        System.out.println("Item removed from cart.");
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItems cart = new CartItems(0, "", 0);
        while (true) {
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display total cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    cart.addItem(price, itemName, quantity);
                    break;
                case 2:
                    cart.removeItem();
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
     }
}
}