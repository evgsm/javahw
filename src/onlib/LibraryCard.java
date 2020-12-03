package onlib;

import java.util.Date;
import java.util.UUID;

public class LibraryCard {
    private final User user;
    private final Date createDay;
    private Bookcase bookcase;
    private final UUID uuid;

    public Account(User user){
        this.user = user;
        accCreateDay = new Date();
        uuid = UUID.randomUUID();
    }

    public void addBook(String author, String name) {

    }
}
