package onlib;
import java.util.ArrayList;

public class Bookcase {
    private int bookcount;      // количество книг в перечне
    ArrayList<Book> bookcase;   // объявление списочного массива

    public Bookcase(){
        this.bookcase = new ArrayList<Book>();     // инициализация списочного массива
    }

    // Сколько книг в перечне
    public int getBookcount(){
        return bookcount;
    }

    // Выдать книгу под номером index из перечня
    public Book getBook(int index) {
        if (index < 0)
            return null;
        if (bookcase.size() == 0)
            return null;
        if (index >= bookcase.size())
            return null;
        return bookcase.get(index);
    }

    // Добавить книгу в перечень
    // (return == true - книга добавлена в перечень, return == false - книга не добавлена)
    public boolean addBook(Book book) {
        if (book == null)
            return false;

        if (bookcase.size()>0) {
            for (Book bk : bookcase) {
                if (bk.hashCode() == book.hashCode()) {
                    if (bk.equals(book) == true)
                        return false;
                }
            }
        }

        bookcase.add(book);
        bookcount++;
        return true;

    }

    // Найти позицию книги в перечне
    // (return >= 0 - позиция книги в перечне, return == -1 - книга в перечне не найдена)
    public int getBookIndex(Book book) {
        if (book == null)
            return -1;
        if (bookcase.size() == 0)
            return -1;
        for(int i=0; i<bookcase.size(); i++) {
            Book bk = bookcase.get(i);
            if (bk.hashCode() == book.hashCode()) {
                if (bk.equals(book))
                    return i;
            }
        }
        return -1;
    }

    // Удалить книгу из перечня
    // (return == true - книга удалена из перечня, return == false - книга в перечне не найдена)
    public boolean removeBook(Book book) {
        if (book == null)
            return false;
        if (bookcase.size() == 0)
            return false;

        int i = getBookIndex(book);
        if (i < 0)
            return false;
        bookcase.remove(i);
        bookcount--;
        return true;
    }

    public int findBook(String str, int [] index, int maxIndex) {
        if (str == null)
            return -1;
        if (bookcase.size() == 0)
            return -1;
        int cnt = 0;
        for(int i=0; i<bookcase.size(); i++) {
            Book bk = bookcase.get(i);
            if( bk.getAuthor().equals(str) == true ||
                bk.getName().equals(str) == true ||
                bk.getIsbn().equals(str) == true) {
                if (cnt < maxIndex)
                    index[cnt++] = i;
                else
                    return cnt;
            }
        }
        return cnt;
    }

    public int findBook(String str1, String str2, int [] index, int maxIndex) {
        if (str1 == null || str2 == null)
            return -1;
        if (bookcase.size() == 0)
            return -1;
        int cnt = 0;
        for(int i=0; i<bookcase.size(); i++) {
            Book bk = bookcase.get(i);
            if( (bk.getAuthor().equals(str1) == true && bk.getName().equals(str2) == true) ||
                    (bk.getAuthor().equals(str2) == true && bk.getName().equals(str1) == true)) {
                if (cnt < maxIndex)
                    index[cnt++] = i;
                else
                    return cnt;
            }
        }
        return cnt;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Book bk:bookcase) {
            str.append(bk.toString()).append("\n");
        }
        return str.toString();
    }
}
