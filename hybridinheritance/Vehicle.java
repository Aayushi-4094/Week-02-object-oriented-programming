package week2.hybridinheritance;

public class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Model: " + model);
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric Vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle");
    }

    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle(200, "Tesla Model 3");
        electricVehicle.displayInfo();
        electricVehicle.charge();
        System.out.println();

        PetrolVehicle petrolVehicle = new PetrolVehicle(250, "Toyota Camry");
        petrolVehicle.displayInfo();
        petrolVehicle.refuel();
}
}
