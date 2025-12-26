package Question_80;

// Base class
class LibraryItem {
    protected String itemID;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is not currently checked out.");
        }
    }

    public void displayDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    private String isbn;

    public Book(String itemID, String title, String author, String isbn) {
        super(itemID, title, author);
        this.isbn = isbn;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
    }
}

// Subclass for Magazine
class Magazine extends LibraryItem {
    private final int issueNumber;

    public Magazine(String itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

class DVD extends LibraryItem {
    private final int duration; // in minutes

    public DVD(String itemID, String title, String author, int duration) {
        super(itemID, title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Test class with main()
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("B101", "The Alchemist", "Paulo Coelho", "978-0061122415");
        Magazine magazine = new Magazine("M202", "National Geographic", "Various Authors", 145);
        DVD dvd = new DVD("D303", "Inception", "Christopher Nolan", 148);

        System.out.println("--- Book Details ---");
        book.displayDetails();
        book.checkOut();
        book.returnItem();

        System.out.println("\n--- Magazine Details ---");
        magazine.displayDetails();
        magazine.checkOut();
        magazine.returnItem();

        System.out.println("\n--- DVD Details ---");
        dvd.displayDetails();
        dvd.checkOut();
        dvd.returnItem();
    }
}
