package org.example;

public class LibraryManagementSystem { // Public class for global access
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Alice", "L001");

        // Adding books
        librarian.addBook("Shoe Dog", "Phil Knight");
        librarian.addBook("The Richest Man in Babylon", "George Samuel Clason");

        // Display books
        librarian.showBooks();

        // Issue a book
        System.out.println("\nIssuing 'Shoe Dog': " +
                (librarian.issueBook("Shoe Dog", "JC Diamante") ? "Success" : "Failed"));

        // Display updated book collection
        librarian.showBooks();
    }
}