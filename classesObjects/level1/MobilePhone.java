package classesObjects.level1;
import java.util.Scanner;
public class MobilePhone {
    String brand;
    String model;
    int price;
    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails(String brand, String model, int price) {
        System.out.println("The mobile phone with Brand "+ brand + " and model "+ model + " has price " + price);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the brand");
        String brand = sc.nextLine();
        System.out.println("Enter the model");
        String model= sc.nextLine();
        System.out.println("Enter the price");
        int price = sc.nextInt();

        MobilePhone mp = new MobilePhone(brand, model, price);
        mp.displayDetails(brand, model, price);
    }
}
