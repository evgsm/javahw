package hashmap;

public class Main {
    public static void main (String [] arg){
        //Создаём новые контакты
        Contact [] contact = new Contact[10];
        for (int i=0; i<contact.length; i++) {
            contact[i] = new Contact("Человечек_"+i, "+7-925-848-44-0"+i);
        }

        // Создаём группы и заполняем их контактами
        PhoneGroup [] group = new PhoneGroup[5];
        for (int i=0; i<group.length; i++) {
            group[i] = new PhoneGroup("Группа_"+i);
            group[i].addContact(contact[i*2]);
            group[i].addContact(contact[i*2+1]);
        }

        // Создаём телефонную книгу и добавляем в неё группы
        PhoneContacts phoneContacts = new PhoneContacts();
        for (PhoneGroup e: group) {
            phoneContacts.addGroup(e);
        }

        // Выводим на экран группы по их названию (в том-то и профит, что по названию)
        for (int i=0;i<group.length;i++) {
            System.out.println(phoneContacts.getGroup("Группа_"+i).toString());
        }

    }
}
