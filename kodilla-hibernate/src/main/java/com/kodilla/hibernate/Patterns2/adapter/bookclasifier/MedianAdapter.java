package com.kodilla.hibernate.Patterns2.adapter.bookclasifier;

import com.kodilla.hibernate.Patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.hibernate.Patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.hibernate.Patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();

        for (Book book : bookSet) {
            books.put(new BookSignature(book.getSignature()), new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear(), book.getSignature()));
        }
        return medianPublicationYear(books);
    }
}
