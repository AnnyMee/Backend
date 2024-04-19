public class Library {                  //как добавить сюда книгу, а не массив?
    private Book[] books;
    private int libraryCapacity;                            //переменная отвечает за места в массиве
    private int size = 0;                                   //переменная будет говорить, в какую позицию, я поставлю новую "книгу"
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
        for(Book book : books) {
            if (book != null) {                              //это условие говорит, что в случае, если книга найдена, она выведется, а если там null то цикл пройдёт мимо и к результату ничего не прибавит
                result = result + book + "\n";               //result += book.toString()
            }
        }
        return result;
    }
    public String toString2 (){
        String result = "";
        for(Book book : books) {
            if (book == null) {
                break;                                      //это условие говорит, что в случае, если найден null то цикл прерывается
            }else{                                          //другими словами, цикл будет работать до тех пор, пока не найдёт пустую ячейку
                result = result + book + "\n";
            }
        }
        return result;
    }
    public String toString3 (){
        String result = "";
        for (int i = 0; i< books.length && i< size; i++){  //альтернатива условия из toString2
            Book book = books[i];
            result = result + book + "\n";
        }
        return result;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getLibraryCapacity() {
        return libraryCapacity;
    }

    public int getSize() {
        return size;
    }
}
