package week2.objectmodeling;

import java.util.ArrayList;

class Employee {
    private String name;
    private String position;
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
}
class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}

 class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void displayCompanyInfo() {
        System.out.println("Company Name: " + name);
        for (Department department : departments) {
            System.out.println("Department Name: " + department.getName());
            for (Employee employee : department.getEmployees()) {
                System.out.println("Employee Name: " + employee.getName() + ", Position: " + employee.getPosition());
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company("ABC Corporation");

        Department hrDepartment = new Department("HR");
        Department itDepartment = new Department("IT");

        Employee employee1 = new Employee("John Doe", "HR Manager");
        Employee employee2 = new Employee("Jane Doe", "Software Engineer");

        hrDepartment.addEmployee(employee1);
        itDepartment.addEmployee(employee2);

        company.addDepartment(hrDepartment);
        company.addDepartment(itDepartment);
        company.displayCompanyInfo();
}
}
