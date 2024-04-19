public class People {
    private Person[] array;

    private int capacity = 3;      //будет отвечать за общий размер массива (сколько там ячеек)

    private int size = 0;           //будет отвечать за актуальный размер массива (показывать номер пустой ячейки после заполненной)

    public People(){

        array = new Person[capacity];
    }
    public void add(Person person){         //метод, который будет добавлять новый объект в следующую пустую(в данном случае) ячейку
        /*if(size<array.length){              //при условии, что size меньше длинны массива
            array[size++] = person;           //позиции с номером size в массиве присваиваем значение person и плюсуем size с 1, чтобы далее указывал на следующую пустую ячейку
        }else{
            enlargeArray();
            array[size++] = person;
        }*/ //вместо кода выше, можно написать это по короче:
        if(size>=array.length) {
            enlargeArray();
        }
        array[size++] = person;
    }
    private void enlargeArray(){     //метод, который будет переписывать все данный в новый метод, который имеет в два раза больше ячеек. Это необходимо, в случае, если место в изначальном массиве закончится
        Person[] temp = new Person[array.length*2];
        for(int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }                           //IDEA, заметив, что ссылки переписаны в другой массив, старый удалит сама
        array = temp;               //теперь мы можем обращаться к этому массиву по имени array и по имени temp
    }

    public String toString(){               //метод, который превращает всё в строку и одновременно убирает null
        String result = "";
        for(Person p : array) {
            if (p != null) {
                result = result + p + " ";
            }
        }
        return result;
    }
    public String fullToString() {          //метод, который превращает всё в строку, но при этом не заполненые ячейки будут null
        String result = "";
        for (Person p : array) {
            result = result + p + " ";
        }
        return result;
    }

    public Person get(int index) {          //метод, который будет выдавать элемент той позиции, которую мы укажем
        if (index>=0 && index<size){
            return array[index];
        }
        return null;
    }
    public int size(){                      //выдаёт сколько ячеек заполнено
        return size;
    }
    public int freeCapacity(){              //выдаёт скольку осталось пустого места
        return array.length - size();       //тут длина массива - метод size
    }
    public Person remove(int index){        //метод, который удаляет один элемент из массива
        if(index < 0 || index >= size){     //условие говорит, что в случае, если мы хотим удалить ячейку меньше нуля или больше/равно значению size
            return null;                    //мы ничего не выводим (эти значения нас не устраивают)
        }
        Person result = array[index];
        for (int i = index+1; i < size; i++){   //цикл берет значение, которое сразу после того, которое мы хотим удалить
            array[i-1]=array[i];                //и передвигает его на место удаляемого элемента.
        }                                       //таким образом, передвигается каждый следующий элемент в предыдущую ячейку
        array[size-1]=null;                     //а значение последней занятой ячейки обнуляем
        size--;                                 //так же минусуем значение size, чтобы можно было увидеть актуальное место в массиве
        return result;
    }

}