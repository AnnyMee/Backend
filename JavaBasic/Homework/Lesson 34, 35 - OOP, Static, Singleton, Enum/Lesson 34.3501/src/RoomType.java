public enum RoomType {
    STANDARD("Standard","Standard room",150),
    STUDIO("Studio","Studio with kitchen",200),
    JUNIORSUITE("Junior Suite","With additional space",250),
    SUITE("Suite","Double with additional space",270),
    DELUXE("Deluxe","Comfort triple",310),
    PRESIDENT("President","Premium comfort",500);
    private String roomType;
    private String typeDescription;
    private int price;

    RoomType(String roomType, String typeDescription, int price) {
        this.roomType = roomType;
        this.typeDescription = typeDescription;
        this.price = price;
    }

    @Override
    public String toString() {
        return " Room type: " + roomType +
                ", description - " + typeDescription +
                ", price - " + price;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public int getPrice() {
        return price;
    }
}
