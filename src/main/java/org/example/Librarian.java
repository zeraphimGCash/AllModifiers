package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Librarian extends User { // Subclass
    private ArrayList<Book> bookCollection;  // Private for internal management

    // Constructor
    public Librarian(String name, String userId) {
        super(name, userId);
        this.bookCollection = new ArrayList<>();
    }

    // Methods
    public void addBook(String title, String author) { // Public access
        bookCollection.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    public void showBooks() {
        System.out.println("Library Collection:");
        for (Book book : bookCollection) {
            System.out.println("- " + book.title + " by " + book.author +
                    (book.isAvailable ? " [Available]" : " [Issued]"));
        }
    }

    public boolean issueBook(String title, String userName) {
        for (Book book : bookCollection) {
            if (book.title.equalsIgnoreCase(title) && book.isAvailable) {
                book.isAvailable = false;
                book.issuedTo = userName;

                // Set return deadline to 14 days from now
                LocalDate deadline = LocalDate.now().plusDays(14);
                book.returnDeadline = deadline.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                System.out.println("Book issued: " + title + " to " + userName + ". Return by: " + book.returnDeadline);
                return true;
            }
        }
        System.out.println("Book not available for issuing: " + title);
        return false;
    }

}

