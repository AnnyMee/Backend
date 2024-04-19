public class Violin extends Instruments{

    public Violin(String name, String producer, int price){

        super(name, producer, price);

    }
    public String toString(){

        return "This is a " + getName() + " by " + getProducer();

    }
    public void description(){

        System.out.println(getName() + " is a bowed stringed instrument having four strings tuned at intervals of a fifth and a usual range from G below middle C upward for more than 4¹/₂ octaves and having a shallow body, shoulders at right angles to the neck, a fingerboard without frets, and a curved bridge.");

    }
}
