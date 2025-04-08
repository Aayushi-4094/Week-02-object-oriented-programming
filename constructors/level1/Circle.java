package week2.constructors.level1;

import java.util.Scanner;

public class Circle {
    double radius;
    Circle() {
        this(24.790);
    }
    Circle(double radius) {
        this.radius = radius;
    }

    void displayDetails() {
        System.out.println("The radius of circle is " + radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle (press enter for default value)");
        String input = sc.nextLine();
        double radius = input.isEmpty() ? 0 : sc.nextDouble();

        Circle c1 = new Circle(); 
        c1.displayDetails();

        Circle c2 = new Circle(radius);
        c2.displayDetails();
    }
}