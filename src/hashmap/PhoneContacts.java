package hashmap;

import java.util.HashMap;

public class PhoneContacts {
    private HashMap<String, PhoneGroup> groupMap;

    public PhoneContacts() {
        this.groupMap = new HashMap<>();
    }

    public HashMap<String, PhoneGroup> getGroupMap() {
        return this.groupMap;
    }

    public PhoneGroup addGroup(PhoneGroup group) {
        return this.groupMap.put(group.getName(), group);
    }

    public PhoneGroup getGroup(String name){
        return groupMap.get(name);
    }
}
