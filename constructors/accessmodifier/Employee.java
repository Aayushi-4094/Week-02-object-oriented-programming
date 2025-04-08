package week2.constructors.accessmodifier;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    public static void main(String[] args) {
        Manager mng = new Manager();
        mng.employeeID = 57745;
        System.out.println("The employee id is :" +mng.employeeID);
        mng.setDepartment("Science");
        System.out.println("The department is : "+ mng.getDepartment());
    }
}
