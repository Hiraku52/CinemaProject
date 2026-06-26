public class Cinema {
    private String name;
    private String address;
    private Room[] rooms;

    public Cinema(String name, String adress, Room[] rooms) {
        this.name = name;
        this.address = adress;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Room[] getRooms() {
        return rooms;
    }


    
}
