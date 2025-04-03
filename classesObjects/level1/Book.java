package classesObjects.level1;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    int price;
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(String title, String author, int price){
        System.out.println("The title of the book is "+ title + " by " + author + " and has price " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book");
        int price = sc.nextInt();
        Book book = new Book(title, author, price);
book.displayDetails(title, author, price);
    }
}
