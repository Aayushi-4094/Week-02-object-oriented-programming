package constructors.level1;

public class Book2 {
    String title;
    String author;
    int price;
    boolean availability;

    Book2() {
        this.title = "Harry Potter and the philosopher's Stone";
        this.author = "J.K.Rowling";
        this.price = 1000;
        this.availability = true;
    }

    Book2(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    Book2(Book2 prevBook2) {
        this.title = prevBook2.title;
        this.author = prevBook2.author;
        this.price = prevBook2.price;
        this.availability = prevBook2.availability;
    }

    public boolean isAvailable() {
        return availability;
    }

    void displayDetails() {
        System.out.println("Title is : " + title);
        System.out.println("Author is : " + author);
        System.out.println("Price is : " + price);
        if (isAvailable()) {
            System.out.println("The book is available to borrow");
        } else {
            System.out.println("The book is not available to borrow");
        }
    }

    void borrowBook() {
        if (isAvailable()) {
            availability = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available for borrowing");
        }
    }

    public static void main(String[] args) {
        Book2 book1 = new Book2();
        System.out.println("Book 1 : ");
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();

        Book2 book2 = new Book2("Harry Potter and Chamber of Secrets", "J.K.Rowling", 780, false);
        System.out.println("Book 2 : ");
        book2.displayDetails();
        book2.borrowBook();
        book2.displayDetails();

        Book2 book3 = new Book2(book2);
        book3.displayDetails();
    }
}
