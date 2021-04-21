import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private static List<Book> bookshelf;

    public Bookshelf() {
        bookshelf = new ArrayList<>(10);
        Book b1 = new Book();
        Book b2 = new Book("Java 1", "Marc Hauschildt", "2021-02-06", 300, true);
        Book b3 = new ChildrensBook();
        Book b4 = new ChildrensBook("Java for Kids", "Marc Hauschildt", "Dr. Suess", "2021-03-14", 50, false);
        bookshelf.add(b1);
        bookshelf.add(b2);
        bookshelf.add(b3);
        bookshelf.add(b4);
    }

    public static List<Book> getBookshelf() {
        return bookshelf;
    }

    public static void addBook(Book book) {
        
    }

    public static void listBooksLeftToRight() {

    }

    public static void listBooksAlphabetically() {

    }

    public static void listBooksReadUnread() {

    }

    public static void listBooksByType() {

    }

    public static void markBookAsRead(int bookIndex) {

    }

    public static void moveBook(int bookIndex, int newIndex) {

    }

    public static void swapBooks(int book1Index, int book2Index) {

    }

    public static void removeBook(int bookIndex) {

    }
}
