package patterns2;

import com.kodilla.hibernate.Patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.hibernate.Patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("J.K Rowling", "Harry potter", 2008, "001");
        Book book2 = new Book("abc", "Indiana Jones", 2003, "002");
        Book book3 = new Book("Cameron", "Avatar", 2000, "003");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedia = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2003, publicationYearMedia, 0);
    }
}

