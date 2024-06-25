import java.util.ArrayList;
import java.util.Scanner;

public class AirlineTicketingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManager flightManager = new FlightManager();

        while (true) {
            System.out.println("\nWelcome to Airline Ticketing System");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. View My Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    flightManager.searchFlights();
                    break;
                case 2:
                    flightManager.bookTicket();
                    break;
                case 3:
                    flightManager.viewBookings();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private String departureDate;
    private String departureTime;
    private ArrayList<Passenger> passengers;
    private int availableSeats;

    public Flight(String flightNumber, String source, String destination, String departureDate, String departureTime, int totalSeats) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
        this.availableSeats = totalSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat(Passenger passenger) {
        if (availableSeats > 0) {
            passengers.add(passenger);
            availableSeats--;
            return true;
        }
        return false;
    }
}

class Passenger {
    private String name;
    private String contactNumber;

    public Passenger(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

class FlightManager {
    private ArrayList<Flight> flights;

    public FlightManager() {
        flights = new ArrayList<>();
        // Add some sample flights here (you can modify this)
        flights.add(new Flight("FL123", "New York", "Los Angeles", "2024-06-15", "10:00", 100));
        flights.add(new Flight("FL456", "London", "Paris", "2024-06-20", "14:00", 50));
    }

    public void searchFlights() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source city: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination city: ");
        String destination = scanner.nextLine();

        boolean found = false;
        for (Flight flight : flights) {
            if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)) {
                System.out.println("\nFlight Details:");
                System.out.println("Flight Number: " + flight.getFlightNumber());
                System.out.println("Departure Date: " + flight.getDepartureDate());
                System.out.println("Departure Time: " + flight.getDepartureTime());
                System.out.print();
            }
