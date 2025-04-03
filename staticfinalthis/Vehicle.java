package staticfinalthis;

public class Vehicle {
public static int registrationFee = 500;
public static int updateRegistrationFee(int newFee) {
registrationFee = newFee;
return registrationFee;
}

public final String registrationNumber;
public String ownerName;
public String vehicleType;

public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
    this.registrationNumber = registrationNumber;
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
}

public void displayRegistrationDetails() {
    System.out.println("Registration Number: " + registrationNumber);
    System.out.println("Owner Name: " + ownerName);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Registration Fee: " + registrationFee);
}

public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("MH12AB1234", "Aayushi Agarwal", "Car");
    if (vehicle instanceof Vehicle) {
        vehicle.displayRegistrationDetails();
    }

    int newRegistrationFee = 600;
    int updatedFee = updateRegistrationFee(newRegistrationFee);
    System.out.println("Updated Registration Fee: " + updatedFee);
}

}