package task_01;

public class Main {
    public static void main(String[] args) {

        //Два базовых способа создания отдельного потока:
        // 1. Наследуемся от класса Thread
        // 2. Реализуем интерфейс Runnable

        // Как запустить:
        // 1. Создаём объект класса и вызываем его метод start
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        // 2. Создаём объект класса и передаём его в конструктор класса Thread, а затем вызываем метод start у объекта класса Thread
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main stream: " + i);
            try {
                Thread.sleep(300);
            }catch (Exception ignored){}
        }
    }



}
