// Book Class
// Create a Java class named Book to represent a book. The class should have the following features:

// Instance Variables:

// title (String): to store the title of the book.

// author (String): to store the name of the author.

// year (int): to store the publication year of the book.


public class Book {
    String title;
    String author;
    int year;

    // Default constructor
    public Book() {
        title = "Not specified";
        author = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        System.out.println("Book 1:");
        Book b1 = new Book(); 
        b1.displayInfo();

        System.out.println(); 

        System.out.println("Book 2:");
        Book b2 = new Book("Java Programming", "Sakshi", 2024); // Parameterized constructor
        b2.displayInfo();
}
}
