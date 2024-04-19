public class Main {
    public static void main(String[] args) {
        Movie f1 = new Movie("Операция Ы", "СССР", 1965);
        System.out.println();
        System.out.println(f1);

        Films films = new Films();
        System.out.println(films);
        System.out.println();

        films.add(f1);
        films.add(new Movie("Фильм2","Страна1", 1994));
        System.out.println(films);
        System.out.println();

        films.add(new Movie("Фильм3","Страна1", 1998));
        films.add(new Movie("Фильм4","Страна2", 1975));
        films.add(new Movie("Фильм5","Страна3", 1993));
        System.out.println(films);
        System.out.println();

        System.out.println("*".repeat(60));
        System.out.println();

        films.add(new Movie("Фильм6","Страна4", 1988));
        System.out.println(films);
        System.out.println();

        System.out.println("*".repeat(60));
        System.out.println();
        System.out.println(films.getArray()[4]);

        System.out.println("*".repeat(60));
        System.out.println();
        films.remove(2);
        System.out.println(films);

        System.out.println("*".repeat(60));
        System.out.println();
        films.remove(2);
        System.out.println(films);

        System.out.println("*".repeat(60));
        System.out.println();
        films.remove(0);
        System.out.println(films);
    }
}