package week2.encapsulation;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem {
    private int loanDuration;

    public Book(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private int loanDuration;
    private boolean isAvailable;

    public Magazine(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private int loanDuration;
    private boolean isAvailable;

    public DVD(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("BK001", "Harry Potter", "J.K.Rowling", 14);
        LibraryItem magazine = new Magazine("MG001", "Vogue Magazine", "Vogue", 7);
        LibraryItem dvd = new DVD("DV001", "Barbie and Princess Pauper", "Barbie", 3);

        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println(magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");
        if (magazine instanceof Reservable) {
            Reservable reservableMagazine = (Reservable) magazine;
            reservableMagazine.reserveItem();
            System.out.println("Availability: " + reservableMagazine.checkAvailability());
        }

        System.out.println(dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
        if (dvd instanceof Reservable) {
            Reservable reservableDVD = (Reservable) dvd;
            reservableDVD.reserveItem();
            System.out.println("Availability: " + reservableDVD.checkAvailability());
     }
}
}
