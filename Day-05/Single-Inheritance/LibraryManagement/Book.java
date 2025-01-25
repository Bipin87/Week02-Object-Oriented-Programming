package LibraryManagement;
// Super class

public class Book{
    // Attributes
    private String title;
    private int publicationYear;

    // Constructor
    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book detail
    public void displayInfo(){
        System.out.println("Book title: " + title + "\n Book publication year: " + publicationYear);
        
    }

}