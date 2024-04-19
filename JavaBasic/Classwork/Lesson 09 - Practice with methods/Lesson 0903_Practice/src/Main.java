public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        printMsg("Hello");
        int a = 10;
        System.out.println("a in main: " + a);
        printMsg("Java");
        printMsg("Time is running.");
    }

    public static double getArea(int radius) {
        return 0.0;
    }

    public static void printMsg(String msg) {
        System.out.println("----- method printMsg is started");
        int a = 20;
        System.out.println("a in printMsg : " + a);
        System.out.println("Our message is: " + msg);
        System.out.println("----- method printMsg is finished");
    }
}