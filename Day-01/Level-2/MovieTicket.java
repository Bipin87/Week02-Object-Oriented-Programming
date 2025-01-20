import java.util.*;

public class MovieTicket {
    private List<Ticket> tickets; // List to store booked tickets
    private int nextSeatNumber;   // Tracks the next available seat number

    // Constructor to initialize the booking system
    public MovieTicket() {
        tickets = new ArrayList<>();
        nextSeatNumber = 1; // Start seat numbers from 1
    }

    // Inner class to represent a movie ticket
    private class Ticket {
        String movieName;
        int seatNumber;
        double price;

        // Constructor for Ticket
        Ticket(String movieName, int seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
        }

        // Method to display ticket details
        void displayTicketDetails() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + String.format("%.2f", price));
        }
    }

    // Method to book a ticket
    public void bookTicket(String movieName, double price) {
        if (price <= 0) {
            System.out.println("Invalid ticket price. Booking failed.");
            return;
        }
        Ticket ticket = new Ticket(movieName, nextSeatNumber, price);
        tickets.add(ticket);
        System.out.println("Ticket booked successfully for " + movieName + ", Seat Number: " + nextSeatNumber);
        nextSeatNumber++;
    }

    // Method to display all booked tickets
    public void displayAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            System.out.println("Booked Tickets:");
            for (Ticket ticket : tickets) {
                ticket.displayTicketDetails();
            }
        }
    }

    // Main method to handle user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket bookingSystem = new MovieTicket();

        while (true) {
            // Display menu options
            System.out.println("\nMovie Ticket Booking System:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display All Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // Validate menu input
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Book a ticket
                    System.out.print("Enter movie name: ");
                    String movieName = sc.nextLine();
                    System.out.print("Enter ticket price: ");
                    double price;

                    try {
                        price = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price input. Booking failed.");
                        continue;
                    }

                    bookingSystem.bookTicket(movieName, price);
                    break;
                case 2:
                    // Display all booked tickets
                    bookingSystem.displayAllTickets();
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    return;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
