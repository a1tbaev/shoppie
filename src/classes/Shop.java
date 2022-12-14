package classes;

import enums.Accessories;
import enums.Books;
import enums.Shops;

import java.math.BigDecimal;
import java.util.List;

public class Shop {
    private Shops name;
    private int money;
    private List<Accessories> accessories;
    private List<Books> books;

    public Shop() {
    }

    public Shop(Shops name, List<Accessories> accessories, int money) {
        this.name = name;
        this.money = money;
        this.accessories = accessories;
    }

    public Shop(Shops name, int money, List<Books> books) {
        this.name = name;
        this.money = money;
        this.books = books;
    }

    public Shops getName() {
        return name;
    }

    public void setName(Shops name) {
        this.name = name;
    }

    public List<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessories> accessories) {
        this.accessories = accessories;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
