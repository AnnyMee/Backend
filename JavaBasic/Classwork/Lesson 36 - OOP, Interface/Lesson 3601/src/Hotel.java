import java.util.Arrays;

public class Hotel {
    private String title;
    public static final Hotel instance = new Hotel("Azaza");

    private Room[] rooms = {
            new Room(RoomType.STANDARD,"11",RoomCapacity.SINGLE),
            new Room(RoomType.STANDARD,"12",RoomCapacity.SINGLE),
            new Room(RoomType.STANDARD,"13",RoomCapacity.DOUBLE),
            new Room(RoomType.STANDARD,"14",RoomCapacity.DOUBLE),
            new Room(RoomType.STUDIO,"21",RoomCapacity.SINGLE),
            new Room(RoomType.STUDIO,"22",RoomCapacity.DOUBLE),
            new Room(RoomType.JUNIOR_SUITE,"31",RoomCapacity.DOUBLE),
            new Room(RoomType.SUITE,"32",RoomCapacity.DOUBLE),
            new Room(RoomType.JUNIOR_SUITE,"33",RoomCapacity.SINGLE),
            new Room(RoomType.SUITE,"34",RoomCapacity.TRIPLE),
            new Room(RoomType.DELUXE,"41",RoomCapacity.DOUBLE),
            new Room(RoomType.DELUXE,"42",RoomCapacity.QUADRUPLE),
            new Room(RoomType.PRESIDENT,"43",RoomCapacity.DOUBLE),
            new Room(RoomType.PRESIDENT,"51",RoomCapacity.QUADRUPLE)};

    private Hotel(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hotel: " +
                " title - " + title + '\'' +
                ", rooms - " + Arrays.toString(rooms);
    }
    public void print(RoomType type){
        for (Room room : rooms) {
            if (room.getRoomDetails().equals(type)){
                System.out.println(room);
            }
        }
    }
    public void print(){
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
    public void print(RoomType type, RoomCapacity capacity){
        for (Room room : rooms) {
            if(room.getRoomDetails().equals(type) && room.getType().equals(capacity))
                System.out.println(room);
        }
    }
}
