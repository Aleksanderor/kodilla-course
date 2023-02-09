package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)


class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    LibraryUser libraryUser = new LibraryUser("tomek","kowal", "921932");

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

        /// given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = generateListOfNBooks(4);

        // when
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // then
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
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
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

        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = generateListOfNBooks(1);
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
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = generateListOfNBooks(5);
        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(5, result.size());
        assertEquals(books, result);
    }
}