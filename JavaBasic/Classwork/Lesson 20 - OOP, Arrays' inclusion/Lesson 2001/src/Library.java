public class Library {
    Book[] books;
    public Library (Book[] books){
        this.books = books;
    }
    public String toString (){
        String result = "";
        for(Book book : books){
            result = result + book.toString() + "\n";               //result += book.toString()
        }
        return result;
    }
}
