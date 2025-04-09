package week2.encapsulation;


    abstract class Employee {
        private int employeeId;
        private String name;
        private double baseSalary;
        public Employee(int employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }
        public int getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getBaseSalary() {
            return baseSalary;
        }
        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }
        public abstract double calculateSalary();
            public void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
        }
    }
        interface Department {
        void assignDepartment(String departmentName);
        String getDepartmentDetails();
    }
        class FullTimeEmployee extends Employee implements Department {
        private String departmentName;
   
        public FullTimeEmployee(int employeeId, String name, double baseSalary) {
            super(employeeId, name, baseSalary);
        }
   
        @Override
        public double calculateSalary() {
            return getBaseSalary();
        }
   
        @Override
        public void assignDepartment(String departmentName) {
            this.departmentName = departmentName;
        }
   
        @Override
        public String getDepartmentDetails() {
            return "Department: " + departmentName;
        }
   
        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println(getDepartmentDetails());
            System.out.println("Salary: " + calculateSalary());
        }
    }
        class PartTimeEmployee extends Employee implements Department {
        private int workHours;
        private double hourlyRate;
        private String departmentName;
   
        public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
            super(employeeId, name, baseSalary);
            this.workHours = workHours;
            this.hourlyRate = hourlyRate;
        }
        @Override
        public double calculateSalary() {
            return workHours * hourlyRate;
        }
        @Override
        public void assignDepartment(String departmentName) {
            this.departmentName = departmentName;
        }
        @Override
        public String getDepartmentDetails() {
            return "Department: " + departmentName;
        }
        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println(getDepartmentDetails());
            System.out.println("Work Hours: " + workHours);
            System.out.println("Hourly Rate: " + hourlyRate);
            System.out.println("Salary: " + calculateSalary());
        }
        public static void main(String[] args) {
            Employee[] employees = new Employee[2];
                employees[0] = new FullTimeEmployee(1, "John Doe", 50000);
            employees[1] = new PartTimeEmployee(2, "Jane Doe", 20000, 20, 50);
                ((Department) employees[0]).assignDepartment("HR");
            ((Department) employees[1]).assignDepartment("Marketing");
                for (Employee employee : employees) {
                employee.displayDetails();
                System.out.println();
         }
    }
    }