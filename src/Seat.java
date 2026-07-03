public class Seat {
    String seatNumber;
    boolean occupied;

    public Seat(String seatNumber, boolean occupied) {
        this.seatNumber = seatNumber;
        this.occupied = occupied;
    }
    
    public String getSeatNumber() {
        return seatNumber;
    }
    public boolean isOccupied() {
        return occupied;
    }
}
