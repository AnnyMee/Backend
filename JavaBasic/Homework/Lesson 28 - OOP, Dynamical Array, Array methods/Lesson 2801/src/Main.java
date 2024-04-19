import java.util.Arrays;

/*
HW_Lesson_27

Реализовать класс Film {несколько полей на ваше усмотрение}.
По примеру кода с занятия, реализовать класс Films, который бы позволил управлять массивом фильмов.
 */
public class Main {
    public static void main(String[] args) {

        Films films = new Films();
        films.addFilm(new Film("Taxi","France", 1998));

        //System.out.println(films);
        //System.out.println(films.toStringWithNull());
        //System.out.println("*".repeat(60));

        films.addFilm(new Film("Taxi 2", "France", 2000));
        films.addFilm(new Film("Taxi 3", "France", 2003));

        //System.out.println(films.actualSize());
        //System.out.println(films.remainingSpace());
        //System.out.println("*".repeat(60));

        //System.out.println(films.getFilm(1));
        //System.out.println("*".repeat(60));

        films.addFilm(new Film("Taxi 4", "France", 2007));
        films.addFilm(new Film("Taxi 5", "France", 2018));
        //System.out.println(films);
        //System.out.println(films.actualSize());
        //System.out.println(films.remainingSpace());
        //System.out.println("*".repeat(60));

        //films.removeFilm(3);

        //for(int i = 0; i < films.actualSize(); i++)
        //   System.out.println(films.getFilm(i));
        //System.out.println("*".repeat(60));

        //System.out.println(films);
        //System.out.println(films.actualSize());
        //System.out.println(films.remainingSpace());
        //System.out.println("*".repeat(60));

        //HW_Lesson_28
        System.out.println(Arrays.toString(films.toArray()));
        System.out.println("*".repeat(60));

        for(int i = 0; i < films.actualSize(); i++)
            System.out.println(films.getFilm(i));
        System.out.println("*".repeat(60));

        films.removeByName ("Taxi 2");
        for(int i = 0; i < films.actualSize(); i++)
            System.out.println(films.getFilm(i));
        System.out.println("*".repeat(60));

        System.out.println(films);
        films.set(new Film("Taxi","France", 1998),2);
        System.out.println(films);



    }
}