class Book{
	String title;
	String author;
	double price;
	// Default constructor
	Book(){
		this.title = "Java";
		this.author = "K.S. Sharma";
		this.price = 799.00;
		
	}
	// Parameterized constructor
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	// Display the details
	void displayDetails(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
public class BookDetails{
	// Main method
	public static void main(String [] args){
		// Create an object of Book class and call default constructor
		Book book1 = new Book();
		// Call Parameterized constructor
        Book book2 = new Book("Python", "G.V. Rossum", 999.90);
        book1.displayDetails();
        book2.displayDetails();		
	}
}