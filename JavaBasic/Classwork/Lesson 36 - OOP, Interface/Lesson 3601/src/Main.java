public class Main {
    public static void main(String[] args) {

        Hotel hotel = Hotel.instance;
        System.out.println();
        hotel.print();

        System.out.println("-".repeat(80));

        RoomType[] types = RoomType.values();
        for(RoomType type : types){
            //System.out.println(type);     //мы задали поведение каждого объекта в классе RoomType
            type.printName();               //поэтому тут всего лишь вызываем абстрактный метод, который создали в том же классе RoomType
        }

        RoomType type = RoomType.valueOf("DELUXE");     //valueOf - метод, который из параметров, которые мы задаём - преобразует объект того типа, который мы далее вызываем
        System.out.println(type==RoomType.DELUXE);            //мы преобразовываем для получения объекта заданного типа

        EnumSingletonDemo instance1 = EnumSingletonDemo.INSTANCE;
        instance1.setValue("Value 2");
        System.out.println(instance1);

    }

}