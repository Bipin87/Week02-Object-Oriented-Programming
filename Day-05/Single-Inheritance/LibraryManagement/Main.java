package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        // Creat the instance of subclass
        Book author = new Author("Rich Dad Poor Dad", 1997, "Robert Kiyosaki", "Robert Kiyosaki is an American businessman and author,known for the 'Rich Dad Poor Dad'");
        
        // display book and author details
        author.displayInfo();
    }
    
}
