package shopImple;

import classes.MyException;
import classes.Person;
import classes.Shop;
import enums.Accessories;
import enums.Books;
import enums.Shops;
import interfaces.Service;

import java.math.BigDecimal;
import java.util.*;

public class ShopImple implements Service {
    List<Accessories> accessories = new LinkedList<>();
    List<Books> books = new LinkedList<>();
    List<Shop> shops = new LinkedList<>();
    Person person;

    @Override
    public String createShop() {
        Shop shop = new Shop(Shops.ALI_BABA, List.of(Accessories.values()), 50000);
        Shop shop1  = new Shop(Shops.RARITET, 40000, List.of(Books.values()));
        shops.add(shop);
        shops.add(shop1);
        return "successfully created!!";
    }

    @Override
    public String createPerson() throws MyException {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("name of person:");
            Person person = new Person(scanner.next(), 20000);
            this.person = person;
            return "successfully created";
        }catch (Exception e){
            throw  new MyException("wrong input");
        }

    }

    @Override
    public List<Shops> allShops() {
        return List.of(Shops.values());
    }

    @Override
    public List<Object> getAllAccessories() {
        List<Object> shops1 = new LinkedList<>();

        for (Accessories value : Accessories.values()) {
            shops1.add(value);
        }
        for (Books value : Books.values()) {
            shops1.add(value);
        }
        return shops1;
    }

    @Override
    public void buySomething() throws MyException {
        List<Accessories> accessories = new LinkedList<>();
        this.accessories = accessories;
        List<Books> books = new LinkedList<>();
        this.books = books;
        try {
            System.out.println("if want to finish buying write  BUY");
            System.out.println("what do want to buy?");
            Scanner scanner = new Scanner(System.in);
            boolean bool = true;
            int total = 0;
            int total1 = 0;
            while (bool) {
                String name = scanner.next();
                for (Accessories value : Accessories.values()) {
                    if (value.name().equals(name.toUpperCase())) {
                        accessories.add(value);
                        person.setMoney(person.getMoney() - value.getPrice());
                        total = total + value.getPrice();
                    }
                }
                for (Books value1 : Books.values()) {
                    if (value1.name().equals(name.toUpperCase())) {
                        books.add(value1);
                        person.setMoney(person.getMoney() - value1.getPrice());
                        total1 = total + value1.getPrice();
                    }
                }

                if (name.equals("BUY")) {
                    bool = false;
                }
            }
            System.out.println(
                    "seller ->" + Shops.ALI_BABA.name() +
                            "\nbuyer ->" + person.getName() +
                            "\ntotal:" + total
            );
            System.out.println(
                    "seller ->" + Shops.RARITET.name() +
                            "\nbuyer ->" + person.getName() +
                            "\ntotal:" + total1
            );
        } catch (Exception e) {
            throw new MyException("wrong input");
        }
    }

    @Override
    public Shop findByNameAccessories() throws MyException {
        try{
            System.out.println("name accessories:");
            String name = new Scanner(System.in).next();
            for (Shop shop : shops) {
                for (Accessories accessory : shop.getAccessories()) {
                    if (accessory.name().equals(name.toUpperCase())){
                        return shop;
                    }
                }
            }
            return null;
        }catch (Exception e){
            throw new MyException("wrong input");
        }
    }

    @Override
    public Comparator<Accessories> sortByPrice() {
        return comparable;
    }

    @Override
    public List<Object> filterByPrice() throws MyException {
        try {
            List<Object> objects = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("minimum price:");
            int min = scanner.nextInt();
            System.out.println("maximum price:");
            int max = scanner.nextInt();
            for (Accessories value : Accessories.values()) {
                if (value.getPrice() > min && value.getPrice() < max){
                    objects.add(value);
                }
            }
            for (Books value : Books.values()) {
                if (value.getPrice()> min && value.getPrice() < max){
                    objects.add(value);
                }
            }
            return objects;
        }catch (Exception e){
            throw new MyException("wrong input");
        }

    }

    @Override
    public void checkPackage() {
        System.out.println(books);
        System.out.println(accessories);
    }

    @Override
    public Comparator<Accessories> findCheaper() {
        return comparable1;
    }

    @Override
    public Person person() {
        return person;
    }

    public static Comparator<Accessories> comparable = new Comparator<Accessories>() {
        @Override
        public int compare(Accessories o1, Accessories o2) {
            return o2.getPrice() - o1.getPrice();
        }
    };
    public static Comparator<Accessories> comparable1 = new Comparator<Accessories>() {
        @Override
        public int compare(Accessories o1, Accessories o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
}
