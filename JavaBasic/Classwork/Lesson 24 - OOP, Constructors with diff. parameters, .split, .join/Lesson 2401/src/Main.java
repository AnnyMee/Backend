public class Main {
    public static void main(String[] args) {
        Book[] arr = {new Book(1,"Чистый код","Роберт Мартин",2008),                               //вместо book1, book2, book3 - сразу значения этих книг вносим в массив
                new Book(2,"Совершенный код", "Стив Макконнелл", 1993),
                new Book(3,"Программист-прагматик", "Дейв Томас и Энди Хант", 1999)
        };

        Library library = new Library(100);
        library.addBook(new Book(1,"Чистый код","Роберт Мартин",2008));
        System.out.println(library);
        System.out.println("Всего " + (library.getSize()<=3 ? (library.getSize()==1 ? library.getSize() + " книга." : library.getSize() + " книги.") : library.getSize() + " книг."));
        System.out.println();
        library.addBook(new Book(2,"Совершенный код", "Стив Макконнелл", 1993));
        System.out.println(library);
        System.out.println("Всего " + (library.getSize()<=3 ? (library.getSize()==1 ? library.getSize() + " книга." : library.getSize() + " книги.") : library.getSize() + " книг."));
        System.out.println();

        //вызываем второй конструктор Book
        library.addBook(new Book(3,"Программист-прагматик",new String[]{"Дейв Томас", "Энди Хант"}, 1999));
        System.out.println(library);
        System.out.println("Всего " + (library.getSize()<=3 ? (library.getSize()==1 ? library.getSize() + " книга." : library.getSize() + " книги.") : library.getSize() + " книг."));
        System.out.println();
        //вызываем первый конструктор с имплементацией string.split (результат будет виден на ";")
        library.addBook(new Book(4,"Язык программирования Си", "Деннис Ритчи,Брайан Керниган",1978));
        System.out.println(library);
        System.out.println("Всего " + (library.getSize()<=3 ? (library.getSize()==1 ? library.getSize() + " книга." : library.getSize() + " книги.") : library.getSize() + " книг."));
        System.out.println();

        /*
        //Что такое значение null - это значение по умолчанию, которое ничего не хранит.
        //Присвоить переменной значение null, практически то же самое, как объявить переменную

        String str = null;      // String str;
        Book book1;             //Book book1 = null

        //int a = str.length(); //выдаст ошибку NullPointerException
        //System.out.println(a);

        Book book = new Book(2,"Совершенный код", "Стив Макконнелл", 1993);
        //book.temp(str);         //снова выдаст ошибку NullPointerException
        System.out.println(book.compare(str)); //сработает и сравнит если str="Дейв Томас и Энди Хант", а пока str равна null, опять выдаст ошибку

        //!!!!! str = "" не одно и то же, что str = null !!!!!

        Book book2 = null;
        System.out.println(book2);             //выдаст null
        System.out.println(book2.toString()); //выдаст ошибку NullPointerException
         */

    }
}