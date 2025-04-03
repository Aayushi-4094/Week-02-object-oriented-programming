package classesObjects.level1;
import java.util.Scanner;
public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void circleArea(double radius){
        double area = PI *Math.pow(radius,2);
        System.out.println("The area of circle is " + area);
    }

    void circleCircum(double radius){
        double circumference = 2 * PI *radius;
        System.out.println("The circumference of circle is "+circumference);
    }

    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);
        c.circleArea(radius);
        c.circleCircum(radius);

    }
    
}
