package org.example;

class User { // Superclass
    protected String name;  // Protected access
    protected String userId;

    // Constructor
    User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
}