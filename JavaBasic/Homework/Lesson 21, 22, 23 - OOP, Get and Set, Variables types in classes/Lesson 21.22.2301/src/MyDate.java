public class MyDate {                                           //в рамках ДЗ в этом классе были созданы только геттеры
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    private void changeDate(int day, int month, int year) throws IllegalAccessException {
        this.day = day;
        this.month = month;
        this.year = year;
        if (!isDateValid()) {
            throw new IllegalAccessException("Ошибка"); //exception
        }
    }
    private int getDaysInMonth(int month, int year){
        int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int daysInMonth = monthDays[month];

        if (month == 2 && isYearLeap()){
            daysInMonth=29;
        }
        return daysInMonth;
    }
    private boolean isDateValid(){
        return year>0 && month>=1 && month<=12 && day>=1 && day<=getDaysInMonth(month,year);
    }
    private boolean isYearLeap(){
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}
