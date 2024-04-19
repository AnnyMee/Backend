/*
HW_Lesson_28

В коде класса Films реализовать методы:

-Film[] toArray() - который возвращает массив всех фильмов
-Film removeByName(String title) - метод удаляет фильм с заданным названием. Если такого названия нет,
метод ничего не делает, возвращает null
-void set(Film film, int index) - метод, который заменяет фильм с индексом index, фильмом переданным в параметре
 */

import java.util.Arrays;

public class Films {
    private Film[] filmCollection;
    private int collectionSize = 0;
    private int collectionCapacity = 3;

    public Films(){                                             //сюда не передаём никаких параметров, ведь они будут добавляться из мэйна, через метод addFilm
        this.filmCollection = new Film[collectionCapacity];     //тут объявляем сколько ячеек есть в данном массиве
    }
    public String toStringWithNull(){                           //с этим методом будут выводиться на экран так же пустые ячейки как null
        String result = "";
        for(Film film : filmCollection){
            result = result + film + " ";
        }
        return result;
    }
    public String toString(){                                   //с этим методом пустые ячейки не будут выводиться
        String result = "";
        for(Film film : filmCollection){
            if(film != null){
                result = result + film + " ";
            }
        }
        return result;
    }
    public void addFilm(Film film){                             //метод, через который добавляем новый фильм
        if(collectionSize >=filmCollection.length){
            enlargeArray();
        }
        filmCollection[collectionSize++] = film;
    }
    public void enlargeArray(){                                 //метод, который позволяет увеличить вместимость, посредством-
        Film[] largerCollection = new Film[filmCollection.length*2];    //-нового метода, вдвое больше предыдущего-
        for(int i=0; i<filmCollection.length; i++){
            largerCollection[i] = filmCollection[i];                    //-и переписания элементов из предыдущего (маленького) массива в новый (большой)
        }
        filmCollection = largerCollection;
    }
    public Film getFilm(int index){                             //index будет указывать на место элемента, а метод будет выводить этот элемент
        if(index>=0 && index<collectionSize){
            return filmCollection[index];
        }
        return null;
    }
    public int actualSize(){
        return collectionSize;
    }
    public int remainingSpace(){
        return filmCollection.length-actualSize();
    }
    public Film removeFilm(int index){                          //index будет указывать на место элемента, который нужно удалить
        if(index<0 && index>=collectionSize){                   //условие, которое нас не устраивает-
            return null;                                        //-вернёт null
        }
        Film temp = filmCollection[index];                      //переменная типа Film содержит элемент позиции index
        for(int i = index+1; i < collectionSize; i++){
            filmCollection[i-1] = filmCollection[i];            //тут происходит копирование с последующей ячейки в предыдущую (которую хотим удалить)
        }
        filmCollection[collectionSize-1]=null;                  //последнее занятое место получает значение null
        collectionSize--;                                       //значение size уменьшается, ведь освободилось одно место
        return temp;
    }
    //HW_Lesson_28
    public Film[] toArray(){
        Film[] films = new Film[filmCollection.length];
        for(int i=0; i<filmCollection.length; i++){
            //todo eliminate null
            films[i] = filmCollection[i];
        }
        filmCollection = films;
        return films;
    }
    public Film removeByName(String title) {            //сделано в классе
        return removeFilm(findByName(title));
    }
    public int findByName(String title){                //сделано в классе
        for(int i=0; i<collectionSize; i++){
            if(filmCollection[i].getName().equals(title)){
                return i;
            }
        }
        return -1;
    }
    public void set(Film film, int index){              //дополнено в классе
        if(index>=0 && index < collectionSize) {
            filmCollection[index] = film;
        }
        if (index>=collectionSize){
            addFilm(film);
        }
    }
}