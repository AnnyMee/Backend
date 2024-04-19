public class Room {
    private RoomType roomDetails;
    public static int id = 0;
    private String roomNumber;
    private RoomCapacity type;

    public Room(RoomType roomDetails, String roomNumber, RoomCapacity type) {
        this.roomDetails = roomDetails;
        id++;
        this.roomNumber = roomNumber;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Room:" +
                " Details -" + roomDetails +
                ", roomNumber - " + roomNumber + ";" + type;
    }
    public RoomType getRoomDetails() {
        return roomDetails;
    }

    public RoomCapacity getType() {
        return type;
    }
}
