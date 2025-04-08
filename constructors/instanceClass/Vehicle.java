package week2.constructors.instanceClass;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFree = 1000;
    public Vehicle(String ownerName, String vehicleType, int registrationFee) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFree = registrationFee;
    }
    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fee: " + registrationFree);
    }

    static void updateRegistrationFee(int newRegistrationFree) {
        registrationFree = newRegistrationFree;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Aayushi", "Car", 1000);
        Vehicle vehicle2 = new Vehicle("Shubh", "Truck", 2000);
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(30000);

        System.out.println("\nUpdated Vehicle  1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nUpdated Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}  
    

