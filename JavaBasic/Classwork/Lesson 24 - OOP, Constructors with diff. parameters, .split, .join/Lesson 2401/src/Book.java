public class Book {
    private int number;
    private String title;
    private String[] author;                                //создали из переменной массив и дальше в коде преобразовали
    private int year;

    public Book (int number, String title, String author, int year){
        //this.author = new String[1];                      //тут объявляем массив
        this.number=number;
        this.title=title;
        this.author=author.split(",");                //тут обращаемся к нулевому элементу из массива
        //сюда можно имплементировать string.split
        this.year=year;
    }
    //создаём другой конструктор в параметры которого будет входить массив
    public Book (int number, String title, String[] author, int year){
        this.number=number;
        this.title=title;
        this.author=author;
        this.year=year;
    }
    private String authorsToString(){
        return String.join(", ", author);         //метод позволяет собрать(соединить) строку из значений

        /* String res = "";
        for(String a : author){                           //тут создаём цикл для пробега по массиву
            res = res + a + ",";                          //выведется лишняя запятая
        }
        return res;
         */
    }
    public String toString() {
        return "Книга " + number+ " [Название:'" + title + '\'' + ", авторы: " + authorsToString() + "; дата публикации:'" + year + '\'' + ']';
    }
    public boolean temp(String str){
        return title.length() > str.length();
    }
    public boolean compare(String author){
        if (author==null){
            return false;
        }
        return author.equals(this.author);
    }
}
