package staticfinalthis;

public class Employee {
    
    public static String companyName = "Volkov co.";
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees = 0;

    public static int displayTotalEmployees() {
        return totalEmployees;
    }
    Employee() {
        this.name = null;
        this.id = 0;
        this.designation = null;
        totalEmployees++;
    }

    Employee(String name, long id, String designation) {
        this.name = name;
        this.id = (int) id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Aayushi Agarwal", 1234567890L, "hod");
        Employee emp2 = new Employee("Shubh", 9876543210L, "vice");
        System.out.println("Company Name: " + Employee.companyName);
        System.out.println("Total Employees: " + Employee.displayTotalEmployees());
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }
        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }
    }
}


