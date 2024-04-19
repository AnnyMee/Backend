import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(1,5,2005);
        //date1.day = 1;
        //date1.month = 5;              - это уже не нужно
        //date1.year = 2005;
        MyDate date2 = new MyDate(5,10,2015);
        //date2.day = 5;
        //date2.month = 10;             - это уже не нужно
        //date2.year = 2015;
        MyDate date3 = new MyDate(1,11,2017);
        //date3.day = 1;
        //date3.month = 11;             - это уже не нужно
        //date3.year = 2017;\
        MyDate date4 = getDateFromScanner();

        MyDate[] dates = {date1,date2,date3,date4};  //MyDate стала типом переменной
        for (MyDate date:dates){
            System.out.println(date.toString()); //вместо писанины снизу
        }
        Person person1 = new Person("Jack", "Smith", date1);
        Person person2 = new Person("Lena", "Smith", date2);
        Person person3 = new Person("Egor", "Ivanov", date3);

        Person[] people = {person1,person2,person3};
        for (Person person : people){
            System.out.println(person.personToString());
        }
                                                                                                  /*
                                                                                                     System.out.println(toString(date1));
                                                                                                      System.out.println(toString(date2));
                                                                                                        System.out.println(toString(date3));
                                                                                                          */
    }
    public static MyDate getDateFromScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input day: ");
        int day = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input year: ");
        int year = scanner.nextInt();

        MyDate date = new MyDate(day,month,year);

        return date;

    }
}