import java.util.ArrayList;

public class Borrower {

    private String name;

    private ArrayList<Book> rental;

    public Borrower(String name){
        this.name = name;
        this.rental = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.rental.add(book);
    }

    public int rentalBookCount(){
        return this.rental.size();
    }

//    Write a method that takes a book from library to borrower collection.
//    1.Add book to library list
//    2.Remove book from library list
//    3.Add book to borrower list

    public void borrow(Book book, Library library){
        library.removeBook(book);
        this.rental.add(book);
    }


}
