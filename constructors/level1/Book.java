package constructors.level1;
public class Book {
    String title;
    String author;
    int price;

    Book(){
        title = "Harry Potter and the philosophers's stone";
        author = "J.K.Rowling";
        price = 920;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("Title is : " + title);
        System.out.println("Author is : " + author);
        System.out.println("Price is : " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Book 1 : ");
        book1.displayDetails();

        Book book2 = new Book("Harry Potter and Chamber of Secrets", "J.K.Rowling", 780);
        System.out.println("Book 2 : ");
        book2.displayDetails();
    }
}
