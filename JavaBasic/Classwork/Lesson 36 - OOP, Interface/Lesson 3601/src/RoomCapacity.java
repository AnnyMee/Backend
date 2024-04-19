public enum RoomCapacity {
    SINGLE("Single",1),
    DOUBLE("Double",2),
    TRIPLE("Triple",3),
    QUADRUPLE("Quadruple",4);

    private String strCapacity;
    private int capacity;


    RoomCapacity(String strCapacity, int capacity) {
        this.strCapacity = strCapacity;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return " RoomCapacity: " + strCapacity;
    }
}

