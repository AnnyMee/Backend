/*
В коде классной работы переписать методы таким образом,
чтобы использовался класс MyDate (Dates)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dates date1 = getDateFromScanner();

        Dates date2 = getDateFromScanner();

        printComparingDates(date1,date2);
    }
    public static String dateToString(Dates date){           //(int day, int month, int year)

        return date.day + "-" + date.month + "-" + date.year;
    }

    public static Dates getDateFromScanner(){
        Scanner scanner = new Scanner(System.in);
        Dates date = new Dates();

        System.out.println("Insert day: ");
        date.day = scanner.nextInt();

        System.out.println("Insert month: ");
        date.month = scanner.nextInt();

        System.out.println("Insert year: ");
        date.year = scanner.nextInt();

        return date;
    }
    public static int compareDates(Dates date1, Dates date2) {


        if (date1.year!=date2.year){
            return date1.year-date2.year;
        }else if (date1.month!=date2.month){
            return date1.month-date1.month;
        }else return date1.day-date1.day;
    }

    public static void printComparingDates(Dates date1, Dates date2){
        int result = compareDates(date1, date2);

        if (result==0){
            System.out.println("Date nr.1: " + dateToString(date1) + " Date nr.2: " + dateToString(date2) + " are equal.");
        }else{
            System.out.println("Date nr.1: " + dateToString(date1) + " Date nr.2: " + dateToString(date2));
            System.out.println(result>0 ? "Date nr.1 comes later" : " Date nr.1 comes earlier");
        }
    }
}