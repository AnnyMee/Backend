public class Piano extends Instruments{

    public Piano(String name, String producer, int price){

        super(name, producer, price);

    }
    public String toString(){

        return "This is a " + getName() + " by " + getProducer();

    }
    public void description(){

        System.out.println(getName() + " is a keyboard musical instrument having wire strings that sound when struck by felt-covered hammers operated from a keyboard.");

    }

}
