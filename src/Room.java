public class Room {
    
    private int number;
    private Movie assignedMovie;
    private Seat [] seats;

    public Room(int number, Movie assignedMovie, int seatCount) {
        this.number = number;
        this.assignedMovie = assignedMovie;
        this.seats = new Seat[seatCount];
        for (int i = 0; i < seats.length; i++) {
            char row = (char) (i / 10 + 'A');
            int numb = i % 10 + 1;
            seats[i] = new Seat(row + "" + numb, false);
        }
    }

    public int getNumber() {
        return number;
    }
    public Movie getAssignedMovie() {
        return assignedMovie;
    }
    public int getDuration() {
        return assignedMovie.getDuration();
    }
    public Seat [] getSeats() {
        return seats;
    }

}
