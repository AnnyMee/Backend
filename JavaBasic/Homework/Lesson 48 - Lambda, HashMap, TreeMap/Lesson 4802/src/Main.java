import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Предположим, что дан список Book {String title, List<Author> authors}, Author – класс {String fName, String lName}
Необходимо сформировать map<Author, List<Book>>, где ключ - автор, а значение список его книг.
Естественно, если у книги несколько авторов, то книга должна отразиться в списке книг всех авторов данной книги.
 */
public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Harry Potter and the Sorcerer's Stone", List.of(new Author("J.K.", "Rowling"))),
                new Book("The Lord of the Rings", List.of(new Author("J.R.R.", "Tolkien"))),
                new Book("The Hobbit", List.of(new Author("J.R.R.", "Tolkien"),new Author("J.K.","Rowling"))),
                new Book("Harry Potter and the Chamber of Secrets", List.of(new Author("J.K.", "Rowling")))
        ));

        //test - System.out.println(createLibrary(books));

        printLibraryByAuthors(createLibrary(books));

    }
    public static Map<Author, List<Book>> createLibrary(List<Book> list){
        Map<Author, List<Book>> map = new HashMap<>();
        for (Book book : list) {
            for (Author author : book.getAuthors()) {
                map.computeIfAbsent(author, k -> new ArrayList<>()).add(book);
            }
        }
        return map;
    }
    public static void printLibraryByAuthors(Map<Author, List<Book>> authorBookMap){

        for (Map.Entry<Author, List<Book>> el : authorBookMap.entrySet()) {         //entrySet для выполнения переборов пар key-value
            System.out.println("Author: " + el.getKey().getFirstName() + " " + el.getKey().getLastName());
            System.out.println("Books: " + el.getValue());
            System.out.println();
        }
    }
}