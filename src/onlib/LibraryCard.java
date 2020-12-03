package onlib;

import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;

public class LibraryCard {
    private final User user;
    private final Date createDate;
    private Bookcase bookList;
    private final UUID uuid;


    public LibraryCard(User user){
        this.user = user;
        this.createDate = new Date();
        this.bookList = new Bookcase();
        this.uuid = UUID.randomUUID();
    }


    public boolean addBook(Book book) {
        if (book == null)
            return false;

        if (bookList.addBook(book) == true)
            return true;
        else
            return false;
    }


    public boolean removeBook(Book book) {
        if (book == null)
            return false;
        if (bookList.getBookcount() == 0)
            return false;

        if (bookList.removeBook(book) == true)
            return true;
        else
            return false;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("==================\n");
        str.append("Читательский билет\n");
        str.append("==================\n");
        str.append(user.toString());
        str.append("Дата выдачи билета: ").append(createDate.toString()).append("\n");
        str.append("Список выданной литературы:\n");
        str.append(bookList.toString());
        str.append("==================\n");
        return str.toString();
    }
}
