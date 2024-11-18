package org.example;

class Book {
    // Default access
    String title;
    String author;
    boolean isAvailable;
    String issuedTo; // for tracking who ordered the book
    String returnDeadline; // deadline on when to return the book

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.issuedTo = null;
        this.returnDeadline = null;
    }
}