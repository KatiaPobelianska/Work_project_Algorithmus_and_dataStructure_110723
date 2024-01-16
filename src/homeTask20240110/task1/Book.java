package homeTask20240110.task1;

import java.util.Objects;

/*Task 1. Для класса Book с полями String name, double price, boolean isPresent
реализовать методы equals(Object o), hashCode(), compareTo(Book another)*/
public class Book implements Comparable<Book>{
    private String name;
    private double price;
    private boolean isPresent;

    public Book(String name, double price, boolean isPresent) {
        this.name = name;
        this.price = price;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPresent() {
        return isPresent;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, price, isPresent);
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
//
    }


    @Override
    public int compareTo(Book o) {
       return this.name.compareTo(o.name);
    }
}
