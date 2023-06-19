package Patterns2.adapter.bookclasifier.libraryb;

public class Book {

    private final String author;
    private final String title;
    private final int yearOfPublication;

    private final String signature;

    public Book(final String author, final String title, final int yearOfPublication, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }
}