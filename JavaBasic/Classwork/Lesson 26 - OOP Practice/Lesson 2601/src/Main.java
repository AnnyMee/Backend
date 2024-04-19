public class Main {
    public static void main(String[] args) {

        String [] names = new String[]{"Jack","Nick","Jacky"};

        NamesHandler handler = new NamesHandler(names);
        NamesHandler handler2 = new NamesHandler("Ron,Rick,Oleg,Klod");

        System.out.println(handler);
        System.out.println(handler2);
        System.out.println(handler2.toStringByLength(4));
        System.out.println(handler2.toStringByStartWith("R"));

    }
}