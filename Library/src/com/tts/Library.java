package com.tts;


import java.util.ArrayList;
import java.util.List;

public class Library {
    // Add the missing implementation to this class
    private String address;
    private final List<Book> bookList = new ArrayList<>();

    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookTitle) {
        boolean stop = false;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookTitle.equals(bookList.get(i).getTitle()) && bookList.get(i).isBorrowed() == false) {
                System.out.println("You successfully borrowed " + bookTitle);
                bookList.get(i).borrowed();
                stop = true;
            } else if (bookTitle.equals(bookList.get(i).getTitle()) && bookList.get(i).isBorrowed() == true) {
                System.out.println("Sorry, this book is already borrowed.");
                stop = true;
            }
        }
        if (stop == false) {
            System.out.println("Sorry, this book is not in our catalog. ");
        }
    }

    public void printAvailableBooks() {
        if (bookList.isEmpty() == false) {
            for (int j = 0; j < bookList.size(); j++) {
                if (bookList.get(j).isBorrowed() == false) {
                    System.out.println(bookList.get(j).getTitle());
                }
            }
        } else {
            System.out.println("No books in catalog.");
        }
    }

    public void returnBook(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookTitle.equals(bookList.get(i).getTitle()) && bookList.get(i).isBorrowed() == true) {
                System.out.println("You successfully returned " + bookTitle);
                bookList.get(i).returned();
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
