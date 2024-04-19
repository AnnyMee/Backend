/*
1.
Давайте создадим класс Programmer. Он будет состоять из следующих полей { Person person, String[] listOfTechnologies }
Класс Person содержит всего два поля { String firstName, String lastName }. Необходимо реализовать конструкторы таким образом,
чтобы Programmer можно было создать:

- используя объект person и массив технологий: new Programmer(person, new String[]{"Java","Spring Boot","SQL"})
- используя объект person и строке со списком технологий через запятую: new Programmer(person, "Java,Spring Boot,SQL")
- используя строку firstName, строку lastName и массив технологий: new Programmer("Jack" "Johnson", new String[]{"Java","Spring Boot","SQL"})
- используя строку ФИО (firstName и lastName разделены пробелом) массив технологий: new Programmer("Jack Johnson", new String[]{"Java","Spring Boot","SQL"})

Необходимо создать массив Programmer и вывести его на экран.

2. (опционально, для тех, кто сделал задачу 1, чуть сложнее)
Реализовать метод который в массиве программистов находит программистов со знанием заданной технологии (например, всех кто знает Java) и выводит на экран.

3. (и еше чуть сложнее)
Метод, реализованный в п.2 должен не выводить на экран, а формировать новый массив Programmer[] содержащий всех программистов с заданной технологией.
 */

public class Main {
    public static void main(String[] args) {
        Programmer[] arr = {new Programmer(new Person("Julia", "Farukh"), new String[]{"Java", "Spring Boot", "SQL"}),
                new Programmer(new Person("Andrea", "Giacomo"), "Rust, Python, SQL"),
                new Programmer("Katarina", "Rausch", new String[]{"HTML", "Git", "Java"}),
                new Programmer("Daniel Mickael", new String[]{"PHP", "Spring Boot", "C++"})};
        System.out.println(transfornToString(arr));

        System.out.println(transfornToString(printSkilledProgrammers(arr,"Java")));         //для вывода нового массива, нужно пройти по нему методом toString
        System.out.println("-".repeat(40));

        System.out.println();


    }
    public static String transfornToString(Programmer[]programmer){     //для вывода массива программистов
        String result = "";                                             //накопительная переменная
        for(Programmer prog : programmer){                              //цикл для каждого элемента (prog) в массиве Programmer ищем/выводим programmer
            result = result + "\n" + prog;
        }
        return result;
    }
    public static Programmer[] printSkilledProgrammers(Programmer[]programmers,String skill){     //метод, который находит программистов с нужным скиллом + прибавляет его в новый массив
        Programmer[] skilledProgrammers = new Programmer[programmers.length];                     //создаём массив с таким же количеством ячеек, как изначальный массив всех программистов
        int result = 0;                                                                           //создаём переменную, которая будет считать номер ячейки в новом массиве
        for(int i = 0; i < programmers.length; i++){                                              //цикл
            if(programmers[i].isSkilled(skill)){                                                  //который проверяет каждую ячейку в изначальном массиве, на наличие скилла
                skilledProgrammers[result] = programmers[i];                                      //и если находит, прибавляет в новый массив значение этого номера ячейки(точнее индексового номера) из изначального массива
                result = result + 1;                                                              //и увеличивает значение индекса
            }
        }
        return skilledProgrammers;                                                                //выводим сам массив
    }
    public static void printByTech(Programmer[] programmers, String [] listOfTech){
        for(Programmer prog : programmers){
            if(prog.skillsToString().equals("Java")){
                System.out.println(prog);
            }
        }
    }
}