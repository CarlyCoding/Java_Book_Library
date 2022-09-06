import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library(100);
        book = new Book("A walk in the woods", "Bill Bryson", "Non-Fiction");

    }

    @Test
    public void bookCountStartsAtZero(){
        assertEquals(0,library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1,library.bookCount());
    }

    @Test
    public void addBookIfCapacityAllows(){
        library.addBookIfCapacityAllows(book);
        assertEquals(1,library.bookCount());
    }

}
