//4.Create a class called Book to represent a book. A Book should include four pieces of information as instance variables‐a book name, an ISBN number, an author name and a publisher. Your class should have a constructor that initializes the four instance variables. Provide a set method and get method for each instance variable. In addition, provide a method named getBookInfo that returns the description of the book as a String.
public class Book {
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    // Constructor to initialize the instance variables
    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    // Getter and setter for bookName
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // Getter and setter for isbnNumber
    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    // Getter and setter for authorName
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // Getter and setter for publisher
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Method to return book information
    public String getBookInfo() {
        return "Book Name: " + bookName + "\nISBN: " + isbnNumber + "\nAuthor: " + authorName + "\nPublisher: " + publisher;
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create a new book
        Book book = new Book("The Great Gatsby", "978-0743273565", "F. Scott Fitzgerald", "Scribner");

        // Display book information
        System.out.println(book.getBookInfo());

        // Modify and display updated book information
        book.setAuthorName("Francis Scott Fitzgerald");
        System.out.println("\nUpdated Book Info:");
        System.out.println(book.getBookInfo());
    }
}
