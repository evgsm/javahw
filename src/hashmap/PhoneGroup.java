package hashmap;

import java.util.HashSet;

public class PhoneGroup {
    private String name;
    private HashSet<Contact> contactSet;

    public PhoneGroup(String name) {
        this.name = name;
        this.contactSet = new HashSet<Contact>();
    }

    public HashSet<Contact> getContactSet() {
        return this.contactSet;
    }

    public String getName() {
        return name;
    }

    public boolean addContact(Contact contact) {
        return this.contactSet.add(contact);
    }

    public boolean removeContact(Contact contact) {
        return this.contactSet.remove(contact);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Группа: " + name + "\n");
        str.append("------------------------\n");
        for (Contact e: contactSet){
            str.append(e.toString());
        }
        return str.toString();
    }
}
