public class Main {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(10,11,2000);
        MyDate date2 = new MyDate(10,11,2001);
        MyDate date3 = date1;

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        date1.setYear(1999);
        System.out.println("-".repeat(10));
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        //результат будет одним и тем же потому, что date1 и date3 содержат адрес на одну и ту же дату и каждая из этих переменных имеет право менять эту дату
        //так работает ссылочный тип переменных (они хранят ссылку, а не значение)
        date3.setYear(1999);
        System.out.println("-".repeat(10));
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}