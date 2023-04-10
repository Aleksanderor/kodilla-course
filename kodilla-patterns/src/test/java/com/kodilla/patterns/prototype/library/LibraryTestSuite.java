package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void getBooksTest(){

        // given
        LocalDate publicationDateBook1 = LocalDate.of(2023,1,23);
        LocalDate publicationDateBook2 = LocalDate.of(2001,1,11);
        LocalDate publicationDateBook3 = LocalDate.of(2022,10,1);
        LocalDate publicationDateBook4 = LocalDate.of(1410,10,11);

        Book book1 = new Book("Ogniem i mieczem", "Henryk Sienkiewczi",publicationDateBook1);
        Book book2 = new Book("Krzyżacy", "Henryk Sienkiewczi",publicationDateBook2);
        Book book3 = new Book("Potop", "Henryk Sienkiewczi",publicationDateBook3);
        Book book4 = new Book("Pan Wołodyjowski", "Henryk Sienkiewczi",publicationDateBook4);

        Library library = new Library("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // when
        library.getBooks().remove(book4);

        // then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, cloneLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), cloneLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
