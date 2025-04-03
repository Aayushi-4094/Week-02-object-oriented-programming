package classesObjects.level2;

import java.util.Scanner;

public class MovieTicket {
    String movieName;
    String seatNumber;
    int price;

    public MovieTicket(String movieName, String seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String seatNumber, int price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.println("Enter seat number: ");
        String seatNumber = sc.nextLine();
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        sc.nextLine();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.displayTicketDetails();
        System.out.println("Do you want to book another ticket? (yes/no)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter new seat number: ");
            String newSeatNumber = sc.nextLine();
            System.out.println("Enter new price: ");
            int newPrice = sc.nextInt();
            ticket.bookTicket(newSeatNumber, newPrice);
            ticket.displayTicketDetails();
        }
}
}
