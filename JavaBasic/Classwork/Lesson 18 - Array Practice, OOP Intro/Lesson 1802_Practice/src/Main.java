public class Main {
    public static void main(String[] args) {
        int[] days = {5, 3};
        int[] months = {11, 11};
        int[] years = {2005, 2005};

        //System.out.println(compareDates(days[0], months[0], years[0], days[1], months[1], years[1]));
        printComparingDates(days[0], months[0], years[0], days[1], months[1], years[1]);
    }

    /*
    0 - даты равны
    > 0 - date1 позже date2
    < 0 - date1 раньше date2
     */
    //моё решение
    public static int compareDates1(int day1, int month1, int year1, int day2, int month2, int year2) {

        if (year1 < year2) {
            return -1;
        } else if (year1 == year2) {
            if (month1 < month2) {
                return -1;
            } else if (month1 == month2) {
                if (day1 < day2) {
                    return -1;
                } else if (day1 == day2) {
                    return 0;
                }
            }
        }
        return 1;
    }
    //решение Андрея
    public static int compareDates(int day1, int month1, int year1, int day2, int month2, int year2) {


        if (year1!=year2){
            return year1>year2 ? 1 : -1;            //year1-year2  (условие было же..)
        }else if (month1!=month2){
            return month1>month2 ? 1 : -1;          //month1-month2
        }else if (day1!=day2){
            return day1>day2 ? 1 : -1;              //day1-day2
        }
        return 0;
    }
    public static void printComparingDates(int day1, int month1, int year1, int day2, int month2, int year2){
        int result = compareDates(day1,month1,year1,day2,month2,year2);

        if (result==0){
            System.out.println("Date nr.1: " + dateToString(day1,month1,year1) + " Date nr.2: " + dateToString(day2,month2,year2) + " are equal.");
        }else{
            System.out.println("Date nr.1: " + dateToString(day1,month1,year1) + " Date nr.2: " + dateToString(day2,month2,year2));
            System.out.println(result>0 ? " Date nr.1 is later" : " Date nr.2 is later");
        }
    }
    public static String dateToString(int day, int month, int year){
        return day+"-"+month+"-"+year;
    }
}