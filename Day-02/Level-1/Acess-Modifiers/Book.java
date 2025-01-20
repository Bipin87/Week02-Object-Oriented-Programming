
class BookLibrarySystem{
    // Declare a attributes
    public int ISBN;
    protected String title;
    private String author;

    // Parameterized constructor
    public BookLibrarySystem(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
// Subclass EBook
class EBook extends BookLibrarySystem{
    public EBook(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Accessing ISBN and title from superclass
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}
public class Book{
    public static void main(String[] args) {
        // Create an instance of EBook
        EBook ebook = new EBook(12345, "Introduction to Java", "John Do java");
        ebook.displayDetails();
        // Accessing author from superclass
        System.out.println("Author: " + ebook.getAuthor());

    }
}