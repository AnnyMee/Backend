public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jack");
        Person p2 = new Person("Lena");
        Dog d1 = new Dog("Bobik");
        Dog d2 = new Dog("Rex");
        Duck du1 = new Duck("Donald");

        Swimming[] arr1 = {p1,p2,d1,d2,du1};
        swimAll(arr1);
        runAll(arr1);
    }

    public static void swimAll(Swimming[] array){
        for(Swimming el : array){
            el.swim();
        }
    }
    public static void runAll(Swimming[] array){
        for(Swimming el : array){
            el.swim();
        }
    }

}