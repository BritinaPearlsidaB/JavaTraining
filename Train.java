import java.util.*;
import java.util.Scanner;

class Train {
    private String name;
    private String departureTime;
    private String sourceStation;
    private String destinationStation;
    private int passengerStrength;
    private int trainNumber;

   
    public Train(String name, String departureTime, String sourceStation, String destinationStation, int passengerStrength, int trainNumber) {
        this.name = name;
        this.departureTime = departureTime;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getPassengerStrength() {
        return passengerStrength;
    }

    public void setPassengerStrength(int passengerStrength) {
        this.passengerStrength = passengerStrength;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
}

class ReservationSystem {
    private List<Train> trains;
    private Map<Integer, List<String>> bookedTickets; // Map of train number to list of booked tickets

    // Constructor
    public ReservationSystem() {
        trains = new ArrayList<>();
        bookedTickets = new HashMap<>();
    }

    // Other methods (display available trains, check seat availability, book ticket, cancel ticket, display ticket details) will be added here

    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter your choice:");
            System.out.println("1. Display available trains");
            System.out.println("2. Check seat availability for a specific train");
            System.out.println("3. Book a ticket");
            System.out.println("4. Cancel a ticket");
            System.out.println("5. Display ticket details");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Display available trains based on source and destination
                    // Implement this method in ReservationSystem class
                    break;
                case 2:
                    // Check seat availability for a specific train
                    // Implement this method in ReservationSystem class
                    break;
                case 3:
                    // Book a ticket
                    // Implement this method in ReservationSystem class
                    break;
                case 4:
                    // Cancel a ticket
                    // Implement this method in ReservationSystem class
                    break;
                case 5:
                    // Display ticket details
                    // Implement this method in ReservationSystem class
                    break;
                case 6:
                    // Exit the program
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
        scanner.close();
    }
}

