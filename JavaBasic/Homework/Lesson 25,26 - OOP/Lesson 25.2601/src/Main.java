/*
Реализовать класс в котором в качестве NamesHandler.
В нем должно быть одно поле String[] names - которое содержит массив имен. Реализовать два конструктора

- конструктор, который принимает массив с именами
- конструктор, который принимает строку, разделенную ','

Реализовать следующие методы:

toString
toStringByLength - все имена на заданной длинны
toStringByStartWith - все имена начинающиеся на заданный символ
 */
public class Main {
    public static void main(String[] args) {

        NamesHandler name1 = new NamesHandler("Alisa, Anastasia, Maria, Alina, Olga");
        NamesHandler name2 = new NamesHandler(new String[]{"Alexander, Mario, Enzo, John, Mycroft"});

        NamesHandler[] names = new NamesHandler[]{name1, name2};

        for (NamesHandler name : names) {
            System.out.println(name);
        }
    }
    public static void toStringByLength(NamesHandler[] names, int index, int position){
        if(names[position].getNames()[position].length() == index){
            System.out.println(names[position].getNames());


        }
    }
}