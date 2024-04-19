public class Instruments {
    private String name;
    private String producer;
    private int price;

    public Instruments(String name, String producer, int price){
        this.name = name;
        this.producer = producer;
        this.price = price;
    }
    public void cost(){

        System.out.println("\n      This " + name + " by " + producer + " costs " + price + " Euro ");

    }
    public void description(){};

    public String getName(){

        return name;

    }
    public String getProducer(){

        return producer;

    }
    public int getPrice(){

        return price;

    }
}
