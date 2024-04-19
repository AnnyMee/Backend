public class Library {                  //как добавить сюда книгу, а не массив?
    Book[] books;
    int libraryCapacity;                            //переменная отвечает за места в массиве
    int size = 0;                                   //переменная будет говорить, в какую позицию, я поставлю новую "книгу"
    public Library (int libraryCapacity){           //конструктор выглядит по другому
        this.books = new Book[libraryCapacity];     //books будет равен массиву, величина которого определяется libraryCapacity
    }

    public void addBook(Book book){                 //создаём метод для заполнения массива "книгами"
        if(size< books.length){                     //если лимит не превышен
            books[size] = book;                     //массив = + новая "книга"
            size++;                                 //лимит сокращается (size плюсуется)
        }
    }
    public String toString (){
        String result = "";
        for(Book book : books){
            result = result + book + "\n";               //result += book.toString()
        }
        return result;
    }
}