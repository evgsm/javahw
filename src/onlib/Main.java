package onlib;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main (String[] arg) {

        // Библиотека начинается с книжной полки
        Bookcase library = new Bookcase();

        // Создаём книги и кладём их на книжную полку
        Book bookGift = new Book(
                "Леонов А.И.",
                "Моноимпульсная радиолокация",
                "Москва",
                "Радио и связь",
                1984,
                312,
                ""
                );
        library.addBook(bookGift);

        Book [] bookBuy = new Book[3];

        bookBuy[0] = new Book(
                "Ефремов И.А.",
                "Звёздные корабли",
                "Москва",
                "АСТ",
                2018,
                384,
                "978-5-17-110692-8"
        );
        bookBuy[1] = new Book(
                "Ефремов И.А.",
                "Лезвие бритвы",
                "Москва",
                "АСТ",
                2019,
                704,
                "978-5-17-091570-5"
        );
        bookBuy[2] = new Book(
                "Макконел С.",
                "Совершенный код. Мастер-класс",
                "Санкт-Петербург",
                "БХВ",
                2018,
                896,
                "978-5-9909805-1-8"
        );

        for (Book bk: bookBuy) {
            library.addBook(bk);
        }

        // Выведем на экран содержимое нашей книжной полки
        System.out.println(library.toString());

        // Попробуем добавить случайную книгу повторно
        library.addBook(bookBuy[1]);

        // Повторно выведем на экран содержимое нашей книжной полки
        System.out.println(library.toString());
        // Как видно, книга не дублируется

        // Добавим читателей нашей бибилотеки
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

        // Выведем этих перцев на экран
        for (User usr: user) {
            System.out.println(usr.toString());
        }

        // Заведём для каждого посетителя читательский билет
        LibraryCard [] libCard = new LibraryCard[user.length];
        for (int i=0; i<libCard.length; i++) {
            libCard[i] = new LibraryCard(user[i]);
        }

        // Выведем на экран наши читательские билеты
        for (LibraryCard cd: libCard){
            System.out.println(cd.toString());
        }

        // Пока билеты не содержат книг.

        // Пришел посетитель user[0] и просит дать ему почитать Ефремова И.А.
        // Ищем Ефремова И.А. на книжной полке:
        int maxIndex = 4;   // могу унести в руках не больше 4х книг
        int [] index = new int[4];
        // Пошел искать
        int cnt = library.findBook("Ефремов И.А.", index, maxIndex);
        // Нашел cnt книг
        if (cnt > 0)
            // Выдаю посетителю всего Ефремова, которого нашел
            for (int i=0; i<cnt; i++){
                libCard[0].addBook(library.getBook(index[i]));
            }
        else
            System.out.println("Не нашел книг Ефремова...");

        // Посмотрим теперь, как выглядит читательский билет этого посетителя
        System.out.printf(libCard[0].toString());
    }
}
