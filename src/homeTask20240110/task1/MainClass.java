package homeTask20240110.task1;

import homeTask20240110.task1.Book;

public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 29.99, true);
        Book book2 = new Book("Book2", 19.99, false);
        Book book3 = new Book("Book1", 29.99, true);


        System.out.println("book1 equals book2: " + book1.equals(book2)); // false
        System.out.println("book1 equals book3: " + book1.equals(book3)); // true


        System.out.println("HashCode - book1: " + book1.hashCode());
        System.out.println("HashCode - book2: " + book2.hashCode());
        System.out.println("HashCode - book3: " + book3.hashCode());

        int comparison1to3 = book1.compareTo(book3);
        String resultMessage = (comparison1to3 < 0) ? " comes before " : (comparison1to3 > 0) ? " comes after " : " is equal to ";

        System.out.println(book1.getName() + resultMessage + book3.getName());

    }
}
