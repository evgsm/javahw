package onlib;

import java.time.LocalDate;
import java.util.*;

public class User {

    private final String firstName;
    private final String secondName;
    private final String familyName;
    private final LocalDate birthDate;

    private final String country;

    private String email;
    private String phoneNumber;

    private final UUID  uuid;



    public User(String familyName,
                String firstName,
                String secondName,
                int birthYear,
                int birthMonth,
                int birthDay,
                String country) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.secondName = secondName;
        // необходимо добавить проверку года, месяца, дня перед подстановкой в конструктор Date()
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.country = country;
        this.uuid = UUID.randomUUID();
    }

    public User(String familyName,
                String firstName,
                String secondName,
                int birthYear,
                int birthMonth,
                int birthDay,
                String country,
                String email,
                String phoneNumber) {
        this(familyName,firstName,secondName,birthYear,birthMonth,birthDay, country);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return String.format(
                "Полное имя: %s %s %s\nДата рождения: %s\nСтрана: %s\nUUID: %s",
                familyName, firstName, secondName, birthDate.toString(), country, uuid.toString());
    }

}
