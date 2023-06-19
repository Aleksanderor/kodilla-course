//package Patterns2.adapter.bookclasifier;
//
//import Patterns2.adapter.bookclasifier.librarya.Classifier;
//import Patterns2.adapter.bookclasifier.libraryb.Book;
//import Patterns2.adapter.bookclasifier.libraryb.BookSignature;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//import java.util.*;
//
//public class MedianAdapter extends MedianAdaptee implements Classifier {
//
//    @Override
//    public int publicationYearMedian(Set<Book> bookSet) {
////
////        Map <BookSignature, com.kodilla.kodilla-hibernate.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
////
////        for(Book book: bookSet){
////            books.put(new BookSignature(book.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getYearOfPublication()));
////        }
////        return medianPublicationYear(books);
////    }
////
//    }