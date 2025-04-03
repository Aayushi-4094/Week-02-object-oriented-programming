package classesObjects.level1;

import java.util.Scanner;

public class Employee {
    String name;
    long id;
    long salary;
    
    Employee(String name, long id, long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name  = sc.nextLine();
        System.out.println("Enter the id of the employee");
        long id = sc.nextLong();
        System.out.println("Enter the salary");
        long salary = sc.nextLong();

        Employee emp = new Employee(name, id, salary);
        emp.displayDetails();
    }
}
