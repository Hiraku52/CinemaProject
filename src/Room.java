public class Room {
    
    private int number;
    private Movie assignedMovie;

    public Room(int number, Movie assignedMovie) {
        this.number = number;
        this.assignedMovie = assignedMovie;
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
}
