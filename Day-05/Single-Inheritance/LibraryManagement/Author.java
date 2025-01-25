package LibraryManagement;

// subclass 
public class Author extends Book {
    // Attributes
    private String name;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author name: " + name + "\n Author bio: " + bio);
    }
    
}
