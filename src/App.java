public class App {
    public static void main(String[] args) throws Exception {

        Movie batman = new Movie("Batman", "Action", 176, "Matt Reeves");
        Movie inception = new Movie("Inception", "Sci-Fi", 148, "Christopher Nolan");
        Movie titanic = new Movie("Titanic", "Romance", 195, "James Cameron");
        Movie avengers = new Movie("Avengers: Endgame", "Action", 181, "Anthony and Joe Russo");

        Room room1 = new Room(1, batman);
        Room room2 = new Room(2, inception);
        Room room3 = new Room(3, titanic);
        Room room4 = new Room(4, avengers);

        Room [] rooms = {room1, room2, room3, room4};

        Cinema cinema = new Cinema("Cinemax", "City Center", rooms);
        System.out.println("Welcome to " + cinema.getName() + ", We are located at " + cinema.getAddress());
        
        for (int i = 0; i < cinema.getRooms().length; i++) {
            Room room = cinema.getRooms()[i];
            System.out.println("Room " + room.getNumber() + ": " + room.getAssignedMovie().getName() + " (" + room.getAssignedMovie().getGenre() + ")" + ", " +room.getDuration() + " minutes, directed by " + room.getAssignedMovie().getDirector());
        }

    }
}


