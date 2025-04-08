package week2.constructors.level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        guestName = "Aayushi";
        roomType = "Suit";
        nights = 5;
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking prevBooking){
        this.guestName = prevBooking.guestName;
        this.roomType = prevBooking.roomType;
        this.nights = prevBooking.nights;
    }
    void displayDetails(){
        System.out.println("The guest name is " + guestName + " the room type is " + roomType + " for " + nights + "nights.");
    }

    public static void main(String[] args){
        HotelBooking hb1 = new HotelBooking();
        System.out.println("Booking 1 is as ");
        hb1.displayDetails();

        HotelBooking hb2 = new HotelBooking("Mumma", "Master Suit" ,  10);
        System.out.println("Booking 2 is as ");
        hb2.displayDetails();

        HotelBooking hb3 = new HotelBooking(hb2);
        System.out.println("Booking 3 is the copy of booking 2 ");
        hb2.displayDetails();

    }
}
