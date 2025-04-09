package week2.encapsulation;


abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;


    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }


    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public double getRentalRate() {
        return rentalRate;
    }


    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;


    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceRate = insuranceRate;
    }


    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }


    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }


    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Insurance Rate: " + insuranceRate;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getInsuranceDetails());
        System.out.println("Rental Cost: " + calculateRentalCost(1));
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }


    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; 
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Rental Cost: " + calculateRentalCost(1));
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;


    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceRate = insuranceRate;
    }


    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }


    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }


    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Insurance Rate: " + insuranceRate;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getInsuranceDetails());
        System.out.println("Rental Cost: " + calculateRentalCost(1));
        System.out.println("Insurance Cost: " + calculateInsurance());
    }


    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("CAR-001", 100, "INS-001", 20);
        vehicles[1] = new Bike("BIK-001", 50);
        vehicles[2] = new Truck("TRK-001", 200, "INS-002", 30);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println();
     }
}
}
