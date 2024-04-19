public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("1. in main (before method) a: " + a);       //1. in main (before method) a: 10
        int b = method1(a);
        System.out.println("4. in main (after method) a: " + a);       //4. in main (before method) a: 10 !!!!
    }
    public static int method1(int a){
        System.out.println("2. in method a: " + a);                     //2. in method a: 10
        a=a+10;
        System.out.println("3. in method a: " + a);                     //3. in method a: 20
        return a;
    }
}

// !!!! значение переменной а не меняется.
// Причина этому то, что система создаёт новую переменную для нового метода,
// меняя только значение новой переменной