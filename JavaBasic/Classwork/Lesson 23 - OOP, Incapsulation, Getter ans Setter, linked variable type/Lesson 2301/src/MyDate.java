public class MyDate {
    private int day;
    private int month;
    private int year;
    //принцип инкапсуляции подразумевает что мы создаём класс и всё что касается работы этого класса помещается в эту самую упаковку класса
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return day + "." + month + "." + year;

    }
    //методы доступа к полям класса
    //гет - доступ к чтению данных из поля класса
    //сет - доступ к изменению данных из поля класса
    //это нужно для того, чтобы мы могли контролировать чтение и запись из класса без прямого доступа к полям класса
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
