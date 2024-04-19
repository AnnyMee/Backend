import java.util.Arrays;

public class Films {
    private int capacity = 4;
    private Movie[] array = new Movie[capacity];
    private int size = 0;


    public String toString(){
        String result = "";
        for(int i = 0; i < size; i++){
            result = result + array[i] + ",\n";
        }
        result = result.length()>1 ? result.substring(0,result.length()-2) : "" ;
        return result + "\n size: " + size + "\n array length: " + array.length;
    }
    public void add (Movie movie){
        if (size >= array.length){
            enlarge();
        }
        array[size++] = movie;
    }
    private void enlarge(){
        array = Arrays.copyOf(array, array.length*2);       //готовый метод для создания нового массива с целью переписания в него данных их старого массива
    }
    private void enlargeOld() {
        Movie[] array2 = new Movie[array.length * 2];   //создаём новый массив в двое больше
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];                   //переписываем из одного массива в другой
        }
        array = array2;
    }
    public Movie[] getArray() {
        return array;
    }
    public int size(){
        return size;
    }
    public Movie remove(int index){
        if(index<0 || index>=size){
            return null;
        }
        Movie removed = array[index];
        for (int i= index+1; i<size; i++){
            array[i-1] = array[i];
        }
        array[--size] = null;
        return removed;
    }
}
