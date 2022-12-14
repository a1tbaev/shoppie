package classes;

import enums.Accessories;
import enums.Books;

import java.math.BigDecimal;
import java.util.List;

public class Person {
    private String name;
    private int money;
    private List<Books> books;
    private List<Accessories> accessories;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public List<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessories> accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "name= " + name +
                "\nmoney= " + money;
    }
}
