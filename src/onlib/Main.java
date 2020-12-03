package onlib;

public class Main {
    public static void main (String[] arg) {

        User [] user = new User[2];

        user[0] = new User(
                "Иванов",
                "Иван",
                "Васильевич",
                1967,
                11,
                20,
                "Россия",
                "ivanov_iv@yandex.ru",
                "+79258761232");

        user[1] = new User(
                "Петров",
                "Николай",
                "Сергеевич",
                1985,
                5,
                25,
                "Россия",
                "petrov_ns@yandex.ru",
                "+79156932545");

        System.out.println(user[0].toString());
        System.out.println(user[1].toString());
    }

    /*        public static void main(String [] args) {
            Book bk0 = new Book("Ефремов И.А.", "Звездные корабли", "Москва", "АСТ", 2018, 384);
            Book bk1 = new Book("Ефремов И.А.", "Звездные корабли", "Москва", "АСТ", 2018, 384);
            bk1.changePublisher("Эксмо");
            bk1.changeYear(2020);
            bk1.changePages(320);

            System.out.println(bk0.toString());
            System.out.println(bk1.toString());
        }*/
}
