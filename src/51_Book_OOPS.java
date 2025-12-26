class Book {

    static  int totalBooks;

    String title;

    String author;

    int isbn;

    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.isbn = isbn;;
        this.author = author;
    }

    // Constructor Chaining
    public Book(int isbn) {
        this("Story", "Anonymous", isbn);
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed, come after few days.");
        } else {
            System.out.println("Enjoy " + this.title);
            this.isBorrowed = true;
        }
    }

    public void returnBook() {
        if (!isBorrowed) {
            System.out.println("Book is not borrowed, it is in the library now.");
        } else {
            System.out.println("Thanks for returning the book, Review it please.");
            this.isBorrowed = false;
        }
    }

    // Static bcz will be same for all Objects
    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String... args) {
        Book book1 = new Book("Book 1", "Atul", 1);
        Book book2 = new Book("Book 2", "Aditya", 2);
        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.borrowBook();
        System.out.println(getTotalBooks());
    }
}
