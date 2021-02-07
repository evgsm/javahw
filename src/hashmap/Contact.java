package hashmap;

import java.util.zip.CRC32;

public class Contact {
    private final String name;
    private final String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return ("Имя: " + name + "\nТел: " + phone + "\n");
    }
}
