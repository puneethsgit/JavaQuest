/*constructor chaining refers to the practice of calling one constructor from another within the same class or from a parent class. This is often done to reuse code and ensure that a series of constructors initialize the object in a consistent way. Constructor chaining can be achieved in two main ways:

Within the same class using this().
Between superclass and subclass using super(). */
/* CONSTRUCTOR CHAINING USING WHITH-IN CLASS */

class Book {
    String title;
    String author;
    double price;

    // Constructor with one parameter
    public Book(String title) {
        this(title, "Unknown Author", 0.0); // calls the three-parameter constructor
    }

    // Constructor with two parameters
    public Book(String title, String author) {
        this(title, author, 0.0); // calls the three-parameter constructor
    }

    // Constructor with three parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class P25constructorchaining {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Python Programming", "John Doe");
        Book book3 = new Book("C++ Programming", "Jane Doe", 29.99);

        book1.display();
        book2.display();
        book3.display();
    }
}

/* In the first constructor:
public Book(String title) takes only one parameter (the title).
Inside this constructor, this(title, "Unknown Author", 0.0); calls the three-parameter constructor. This means it reuses the logic of the three-parameter constructor to set the default values for author and price.
HOW IS IT CALLING THE THIRD PARAMETER CONSTRUCTOR 
In Java, the keyword this can refer to the current object. When you use this() inside a constructor, you are telling Java to call another constructor in the same class. This is a special way to call one constructor from another. */