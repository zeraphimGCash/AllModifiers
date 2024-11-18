Real-World Use Case: Library Management System
This Java project simulates a library system where different modifiers are used to represent different levels of access and control.

Objective:
Public Modifier: Allow global access to main functionalities.
Private Modifier: Restrict access to sensitive data like user credentials or book stock.
Protected Modifier: Provide restricted access for subclasses (e.g., Librarian).
Default Modifier: Package-level access for helper classes like Book or User.
Code Structure:
Main Class: LibraryManagementSystem
The entry point where users interact with the system.

Helper Class: Book
Default access for package-level sharing.

Super Class: User
Base class for common user attributes (e.g., id, name). Implements protected for fields.

Subclass: Librarian
Extends User to add librarian-specific functionalities like managing books.

Business Logic:

Add, issue, and return books.
Public methods for user interaction.
Private methods for data security.


Explanation:
Public Modifier:

Used in LibraryManagementSystem and public methods in Librarian.
Ensures global access to manage books.
Private Modifier:

Secures the bookCollection field in Librarian, allowing controlled access only through methods.
Protected Modifier:

Shares user information (name, userId) between User and its subclass Librarian.
Default Modifier:

Book class is restricted to the same package to prevent external misuse.
Evaluation Metrics:
Object Types: Classes, methods, and inheritance used effectively.
Modifiers: Realistic application of all four modifiers.
Business Logic: Clear simulation of library workflows (e.g., adding, listing, issuing books).