public enum RoomType {              //enum не только класс, который имеет свои заданные объекты. В каждом объекте можно создать ещё и метод
    STANDARD("Standard room",150){
        public void printName(){
            System.out.println("STANDARD (" + this.getTypeDescription() + ")");
        }
    },
    STUDIO("Studio with kitchen",200){
        public void printName(){
            System.out.println("STUDIO (" + this.getTypeDescription() + ")");
        }
    },
    JUNIOR_SUITE("With additional space",250){
        public void printName(){
            System.out.println("JUNIOR_SUITE (" + this.getTypeDescription() + ")");
        }
    },
    SUITE("Double with additional space",270){
        public void printName(){
            System.out.println("SUITE (" + this.getTypeDescription() + ")");
        }
    },
    DELUXE("Comfort triple",310){
        public void printName(){
            System.out.println("DELUXE (" + this.getTypeDescription() + ")");
        }
    },
    PRESIDENT("Premium comfort",500){
        public void printName(){
            System.out.println("PRESIDENT (" + this.getTypeDescription() + ")");
        }
    };
    //private String roomType;
    private String typeDescription;
    private int price;

    RoomType(/*String roomType8*/String typeDescription, int price) {
        //this.roomType = roomType;
        this.typeDescription = typeDescription;
        this.price = price;
    }

    @Override
    public String toString() {
        return //" Room type: " + roomType +
                "Description - " + typeDescription +
                ", price - " + price;
    }

    public String getTypeDescription() {
        return typeDescription;
    }
    public abstract void printName();
}