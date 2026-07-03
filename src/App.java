import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Movie batman = new Movie("Batman", "Action", 176, "Matt Reeves");
        Movie inception = new Movie("Inception", "Sci-Fi", 148, "Christopher Nolan");
        Movie titanic = new Movie("Titanic", "Romance", 195, "James Cameron");
        Movie avengers = new Movie("Avengers: Endgame", "Action", 181, "Anthony and Joe Russo");

        Room room1 = new Room(1, batman, 10);
        Room room2 = new Room(2, inception, 10);
        Room room3 = new Room(3, titanic, 10);
        Room room4 = new Room(4, avengers, 10);

        Room [] rooms = {room1, room2, room3, room4};

        Cinema cinema = new Cinema("Cinemax", "City Center", rooms);
        System.out.println("Welcome to " + cinema.getName() + ", We are located at " + cinema.getAddress());
        System.out.println("Choose an option: 1. View all movies, 2. Search movies, 3. View seats of a room, 4. exit: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (choice != 4) {
            if (choice == 1) {
                for (int i = 0; i < cinema.getRooms().length; i++) {
                    Room room = cinema.getRooms()[i];
                    System.out.println("Room " + room.getNumber() + ": " + room.getAssignedMovie().getName() + " (" + room.getAssignedMovie().getGenre() + ")" + ", " +room.getDuration() + " minutes, directed by " + room.getAssignedMovie().getDirector());
                }
            } else if (choice == 2) {
                System.out.println("Enter the movie name you want to search for:");
                String movieName = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < cinema.getRooms().length; i++) {
                    Room room = cinema.getRooms()[i];
                    if (room.getAssignedMovie().getName().equalsIgnoreCase(movieName)) {
                        System.out.println("Movie found in Room " + room.getNumber() + ": " + room.getAssignedMovie().getName() + " (" + room.getAssignedMovie().getGenre() + ")" + ", " +room.getDuration() + " minutes, directed by " + room.getAssignedMovie().getDirector());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Movie not found.");
                }
            } else if (choice == 3) {
                System.out.println("Enter the room number you want to view seats for:");
                int roomNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                boolean roomFound = false;
                for (int i = 0; i < cinema.getRooms().length; i++) {
                    Room room = cinema.getRooms()[i];
                    if (room.getNumber() == roomNumber) {
                        System.out.println("Seats in Room " + room.getNumber() + ":");
                        for (Seat seat : room.getSeats()) {
                            System.out.println("  Seat " + seat.getSeatNumber() + ": " + (seat.isOccupied() ? "Occupied" : "Available"));
                        }
                        roomFound = true;
                        break;
                    }
                }
                if (!roomFound) {
                    System.out.println("Room not found.");
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
            System.out.println("Choose an option: 1. View all movies, 2. Search movies, 3. View seats of a room, 4. exit: ");
            choice = scanner.nextInt();
        }

        System.out.println("Thank you for visiting " + cinema.getName() + "!");        

        scanner.close();

    }
}


