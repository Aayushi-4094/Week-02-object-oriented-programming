package week2.constructors.accessmodifier;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public static void main(String[] args) {
        EBook eBook = new EBook();
        eBook.ISBN = "1234567890"; 
        eBook.title = "Harry Potter and the prisoner of Azkaban"; 
        eBook.setTitle("Harry Potter and the prisoner of Azkaban");
        System.out.println("Title: " + eBook.getTitle());

        eBook.setAuthor("J.K.Rowling");
        System.out.println("Author: " + eBook.getAuthor());
    }
}
