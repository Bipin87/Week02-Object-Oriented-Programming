class Book {
    // Book attributes
    String title;
    String author;
    double price;
    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // 
    void displayBookDetails() {
        System.out.println("Book name :" + title);
        System.out.println("Book author :" + author);
        System.out.println("Book price :"+price);
    }
    public static void main(String[] args) {
        Book book = new Book("Java", "Herbert Schildt", 999.99);
        // Display book details
        book.displayBookDetails();
    }
}