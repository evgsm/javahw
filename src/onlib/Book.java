package onlib;

import java.util.zip.CRC32;
import java.util.UUID;

public class Book {
    private final String author;
    private final String name;
    private final String city;
    private final String publisher;
    private final int year;
    private final int pages;
    private final String isbn;
    private final UUID uuid;

    private final int hash;

    Book(String author, String name, String city, String publisher, int year, int pages, String isbn){
        this.author = author;
        this.name = name;
        this.city = city;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.isbn = isbn;
        this.uuid = UUID.randomUUID();

        // Calculate hash
        StringBuilder str = new StringBuilder();
        str.append(author).append(name).append(city).append(publisher).append(year).append(pages).append(isbn);
        CRC32 crc = new CRC32();
        crc.update(str.toString().getBytes());
        this.hash = (int)crc.getValue();
    }

    public String getAuthor() { return author; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public int getPages() { return pages; }
    public String getIsbn() { return isbn; }

    public boolean equals(Book book) {
        if (this == null)
            return false;
        else if (this == book)
            return true;
        else if (   this.author.equals(book.getAuthor()) == true &&
                    this.name.equals(book.getName()) == true &&
                    this.city.equals(book.getCity()) == true &&
                    this.publisher.equals(book.getPublisher()) == true &&
                    this.pages == book.getPages() &&
                    this.year == book.getYear() &&
                    this.isbn.equals(book.getIsbn())    )
        {
            return true;
        }
        else
            return false;
    }
    public int hashCode() {
        return hash;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(getAuthor()); 	str.append(", ");
        str.append(getName()); 		str.append(". - ");
        str.append(getCity()); 		str.append(": Издательство ");
        str.append(getPublisher()); str.append(", ");
        str.append(String.valueOf(getYear())); 		str.append(". - ");
        str.append(String.valueOf(getPages())); 	str.append(" c.");

        return str.toString();
    }
}
