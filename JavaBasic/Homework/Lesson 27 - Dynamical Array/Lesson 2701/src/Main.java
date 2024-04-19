/*
HW_Lesson_27

Реализовать класс Film {несколько полей на ваше усмотрение}.
По примеру кода с занятия, реализовать класс Films, который бы позволил управлять массивом фильмов.
 */
public class Main {
    public static void main(String[] args) {

        Films filmCollection = new Films();
        filmCollection.addFilm(new Film("Taxi","France", 1998));

        System.out.println(filmCollection);
        System.out.println(filmCollection.toStringWithNull());
        System.out.println("*".repeat(60));

        filmCollection.addFilm(new Film("Taxi 2", "France", 2000));
        filmCollection.addFilm(new Film("Taxi 3", "France", 2003));

        System.out.println(filmCollection.actualSize());
        System.out.println(filmCollection.remainingSpace());
        System.out.println("*".repeat(60));

        System.out.println(filmCollection.getFilm(1));
        System.out.println("*".repeat(60));

        filmCollection.addFilm(new Film("Taxi 4", "France", 2007));
        filmCollection.addFilm(new Film("Taxi 5", "France", 2018));

        System.out.println(filmCollection.actualSize());
        System.out.println(filmCollection.remainingSpace());
        System.out.println("*".repeat(60));

        filmCollection.removeFilm(3);

        for(int i = 0; i < filmCollection.actualSize(); i++)
            System.out.println(filmCollection.getFilm(i));
        System.out.println("*".repeat(60));

        System.out.println(filmCollection);
        System.out.println(filmCollection.actualSize());
        System.out.println(filmCollection.remainingSpace());
    }
}