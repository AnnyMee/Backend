public class Guitar extends Instruments{

    public Guitar(String name, String producer, int price){

        super(name, producer, price);

    }
    public String toString(){

        return "This is a " + getName() + " by " + getProducer();
    }
    public void description(){

        System.out.println(getName() + " is a stringed instrument with a flat body, a long neck with frets, and usually six strings that are played with the fingers or with a pick.");

    }
}
