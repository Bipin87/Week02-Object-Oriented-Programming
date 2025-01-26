package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Manage all items using LibraryItem reference
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "John Doe");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Display item details and loan durations
        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println(magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");

        System.out.println(dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");

        // Reserving items
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Arun");
        System.out.println("Book Availability: " + reservableBook.checkAvailability());

        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem("Abhilash");
        System.out.println("Magazine Availability: " + reservableMagazine.checkAvailability());
    }
}
