public class Main {
    public static void main(String[] args) {
        int[] days = {5, 8};
        int[] months = {11, 12};
        int[] years = {2005, 2010};

        System.out.println(compareDates(days[0], months[0], years[0], days[1], months[1], years[1]));
    }

    /*
    0 - даты равны
    > 0 - date1 позже date2
    < 0 - date1 раньше date2
     */
    public static int compareDates(int day1, int month1, int year1, int day2, int month2, int year2) {

        int date1 = 10000*year1+100*month1+day1;
        int date2 = 10000*year2+100*month2+day2;
        return date1-date2;
    }

}