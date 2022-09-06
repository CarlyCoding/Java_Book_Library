import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    Book book;

    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower("Carly");
        book = new Book("Wild Swans", "Jung Chang","Biographical");
        library = new Library(100);
        library.addBook(book);
    }

    @Test
    public void canAddBookToRentals(){
        borrower.addBook(book);
        assertEquals(1,borrower.rentalBookCount());
    }

    @Test
    public void canBorrowFromLibrary(){
        library.removeBook(book);
        assertEquals(0,library.bookCount());
        borrower.addBook(book);
        assertEquals(1,borrower.rentalBookCount());
    }

}
