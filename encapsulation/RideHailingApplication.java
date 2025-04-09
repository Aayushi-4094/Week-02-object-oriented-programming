package week2.encapsulation;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.5;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.0;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR001", "Aayushi Agarwal", 10);
        Vehicle bike = new Bike("BIK001", "Pritesh Agarwal", 5);
        Vehicle auto = new Auto("AUT001", "Kriti ", 8);

        System.out.println(car.getVehicleDetails());
        System.out.println("Fare: " + car.calculateFare(10));
        if (car instanceof GPS) {
            GPS gps = (GPS) car;
            gps.updateLocation("Bangalore");
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }

        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare: " + bike.calculateFare(10));
        if (bike instanceof GPS) {
            GPS gps = (GPS) bike;
            gps.updateLocation("Mumbai");
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }

        System.out.println(auto.getVehicleDetails());
        System.out.println("Fare: " + auto.calculateFare(10));
        if (auto instanceof GPS) {
            GPS gps = (GPS) auto;
            gps.updateLocation("Delhi");
            System.out.println("Current Location: " + gps.getCurrentLocation());
     }
}
}
