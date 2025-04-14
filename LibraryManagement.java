// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Fiction class
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

// Non-Fiction class
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction book2 = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}
