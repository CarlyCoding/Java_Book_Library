import java.util.ArrayList;

public class Library {

    private ArrayList<Book> titles;
    private int capacity;

    public Library(int capacity){
        this.titles = new ArrayList<Book>();
        this.capacity = capacity;
    }

//    This method will return the size of the array list and therefore the titles within. This will count the books
//    in the library.
    public int bookCount(){
        return this.titles.size();
    }
//  This will add a book to the library.
    public void addBook(Book book){
        this.titles.add(book);
    }
//    This will remove a book from the library.
    public void removeBook(Book book){
        this.titles.remove(book);
    }
//  This will add a book to the library if the capacity allows it.
    public void addBookIfCapacityAllows(Book book){
        if (this.bookCount() < this.capacity){
            this.titles.add(book);
        }
    }

}
