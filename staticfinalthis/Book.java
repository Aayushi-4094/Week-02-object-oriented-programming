package week2.staticfinalthis;

public class Book {
    public static String libraryName = "Ocean of books";
    private final long isbn;
    private String title;
    private String author;

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the chamber of secrets", "J.K.Rowling", 1234567890L);
        Book book2 = new Book("Harry Potter and the goblet of fire", "J.K.Rowling", 9876543210L);
        System.out.println("Library Name: " + Book.libraryName);
        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}



