package onlib;

import java.util.Date;
import java.util.UUID;

public class LibraryCard {
    private final User user;
    private final Date createDate;
    private Bookcase bookcase;
    private final UUID uuid;

    public LibraryCard(User user){
        this.user = user;
        createDate = new Date();
        uuid = UUID.randomUUID();
    }

    public void addBook(String author, String name) {

    }
}
