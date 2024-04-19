public class Main {
    public static void main(String[] args) {
        int[] arr = {10,1};
        System.out.println("1. in main (before method) a: " + arr[0]);      //1. in main (before method) a: 10
        int b = method1(arr);
        System.out.println("4. in main (after method) a: " + arr[0]);      //4. in main (before method) a: 20 !!!!
    }
    public static int method1(int[] arr){
        System.out.println("2. in method a: " + arr[0]);                    //2. in method a: 10
        arr[0]=arr[0]+10;
        System.out.println("3. in method a: " + arr[0]);                    //3. in method a: 20
        return arr[0];
    }
}
// !!!! значение позиции [0] в массиве arr поменялось.
// Причина этому то, что система не создаёт новый массив для каждого метода, а всего лишь замечает ссылку на него в памяти,
// меняя уже значения в массиве по данной ссылке
// потому массивы считаются ссылочными типами переменных