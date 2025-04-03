package constructors.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(){
        customerName = "Aayushi";
        carModel = "Mercedes s Class";
        rentalDays = 365;
    }
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = this.customerName;
        this.carModel = this.carModel;
        this.rentalDays = this.rentalDays;

    }

    void displayDetails(){
    System.out.println("The customer name is " + customerName);
    System.out.println("The  odel name is  " + carModel);
    System.out.println("The number of rental days are "+ rentalDays);
    }

    public static void main(String[] args){
        CarRental cr1 = new CarRental();
        cr1.displayDetails();
        CarRental cr2 = new CarRental("Shubh", "Aston Martin vantage v12", 22);
        cr2.displayDetails();

    }
}
