import java.util.Arrays;

/*
Написать как минимум одну иерархию классов в которой будет один родительский класс и хотя бы два наследника,
расширяющих его функционал. Классы наследники должны иметь хотя бы 1 "собственный метод" т.е. поведение,
которое их отличает от класса родителя и от остальных потомков.
 */
public class Main {
    public static void main(String[] args) {

        Piano p1 = new Piano("Piano","Thomann", 999);
        Piano p2 = new Piano("Piano","Cantabile", 899);
        Guitar g1 = new Guitar("Guitar","Fender", 450);
        Guitar g2 = new Guitar("Guitar", "Yamaha", 300);
        Violin v1 = new Violin("Violin", "Stentor", 387);
        Violin v2 = new Violin("Violin", "Harley Benton", 169);

        Instruments[] collection = {p1,p2,g1,g2,v1,v2};
        System.out.println(Arrays.toString(collection));
        System.out.println("*".repeat(180));

        for (Instruments instrument : collection){
            instrument.cost();
            instrument.description();
        }

    }
}