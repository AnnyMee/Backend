import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();  //вызываем класс Mydate и задаём ему значения
        date1.day = 11;               //IDEA сама подсказывает, что в классе MyDate есть деньб месяц и год
        date1.month = 11;
        date1.year = 2000;

        MyDate date2 = new MyDate(); //снова вызываем класс Mydate и задаём ему значения
        date2.day = 10;
        date2.month = 11;
        date2.year = 2001;

        System.out.println(dateToString(date1));
        System.out.println(dateToString(date2));

        MyDate date3 = getDateFromScanner();
        System.out.println(dateToString(date3));

        /*
        int[] days = {11, 10};
        int[] months = {11, 11};
        int[] years = {2000, 2001};

        //System.out.println(compareDates(days[0], months[0], years[0], days[1], months[1], years[1]));
        //printComparingDates(days[0], months[0], years[0], days[1], months[1], years[1]);
         */
    }
    /*
    0 - даты равны
    > 0 - date1 позже date2
    < 0 - date1 раньше date2
     */
    public static String dateToString(MyDate date){           //(int day, int month, int year)
        return date.day + "-" + date.month + "-" + date.year;
    }

    public static MyDate getDateFromScanner(){
        Scanner scanner = new Scanner(System.in);
        MyDate date = new MyDate();

        System.out.println("Insert day: ");
        date.day = scanner.nextInt();

        System.out.println("Insert month: ");
        date.month = scanner.nextInt();

        System.out.println("Insert year: ");
        date.year = scanner.nextInt();

        return date;
    }

    public static int compareDates(int day1, int month1, int year1, int day2, int month2, int year2) {


        if (year1!=year2){
            return year1-year2;            //year1>year2 ? 1 : -1; (условие было же..)
        }else if (month1!=month2){
            return month1-month2;          //month1>month2 ? 1 : -1
        }else return day1-day2;            //day1>day2 ? 1 : -1
    }
        /*
    public static void printComparingDates(int day1, int month1, int year1, int day2, int month2, int year2){
        int result = compareDates(day1,month1,year1,day2,month2,year2);

        if (result==0){
            System.out.println("Date nr.1: " + dateToString(day1,month1,year1) + " Date nr.2: " + dateToString(day2,month2,year2) + " are equal.");
        }else{
            System.out.println("Date nr.1: " + dateToString(day1,month1,year1) + " Date nr.2: " + dateToString(day2,month2,year2));
            System.out.println(result>0 ? " Date nr.1 is later" : " Date nr.2 is later");
        }

    }

     */

}