package Level;

class LibraryMangementSystem{
    // Attributes of the class
    static String libraryName= "Central Library";
    String title;
    String author;
    final int isbn;


    // Constructor of the class
    public LibraryMangementSystem(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        
    }
    static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }
    // Method to display the details of the book
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }

}


public class Book {
    public static void main(String[] args) {
        // Creating an object of the class
        LibraryMangementSystem library1 = new LibraryMangementSystem( "Harry Potter","J.K. Rowling", 123456789);
        LibraryMangementSystem library2 = new LibraryMangementSystem("The Lord of the Rings", "J.R.R. Tolkien",987654321);


        if(library1 instanceof LibraryMangementSystem){
            // Displaying the library name
            library1.displayLibraryName();
            library1.displayBookDetails();
        }
        if (library2 instanceof LibraryMangementSystem){
            library2.displayLibraryName();
            library2.displayBookDetails();
        }

    }
    
}
