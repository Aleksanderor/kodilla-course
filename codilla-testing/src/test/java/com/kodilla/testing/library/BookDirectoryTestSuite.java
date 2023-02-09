package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)


class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test                                                                               // [1]
    void testListBooksWithConditionsReturnList() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        // when
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        //then
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        //when
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {

        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //when
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    @DisplayName("When library user han no book " +
            "then the books list should be empty")
    void testListFfBookInHandOffIs0() {
        //given
        LibraryUser libraryUser = new LibraryUser("tomek","kowal", "921932");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = Collections.emptyList();
        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(0, result.size());
        assertEquals(books, result);
    }
    @Test
    @DisplayName("When library user has 1 book " +
            "then the books list have 1 posistion")
    void  testListFfBookInHandOffIs1 () {

        LibraryUser libraryUser = new LibraryUser("tomek","kowal", "921932");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = Arrays.asList(
                new Book ("arsr","arrfgtrr", 1231223)
        );
        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(1, result.size());
        assertEquals(books, result);
    }
    @Test
    @DisplayName("When library user has 5 books " +
            "then the books list should have 5 posistions")
    void testListFfBookInHandOffIs5(){

        //given
        LibraryUser libraryUser = new LibraryUser("tomek","kowal", "921932");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = Arrays.asList(
        new Book ("arsr","arrfgtrr", 1231223),
        new Book ("arrrrr","arrqwerr", 1231123),
        new Book ("arrwr","arrqewqqwerr", 1213123),
        new Book ("arrrqqrr","arrwwrr", 1235123),
        new Book ("arttrr","arrwrr", 1231823)
        );
        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(5, result.size());
        assertEquals(books, result);
    }
}