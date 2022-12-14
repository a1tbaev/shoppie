package interfaces;

import classes.MyException;
import classes.Person;
import classes.Shop;
import enums.Accessories;
import enums.Shops;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public interface Service {
    String createShop();
    String createPerson() throws MyException;
    List<Shops> allShops();
    List<Object> getAllAccessories();
    void buySomething() throws MyException;
    Shop findByNameAccessories() throws MyException;
    Comparator<Accessories> sortByPrice();
    List<Object> filterByPrice() throws MyException;
    void checkPackage();
    Comparator<Accessories> findCheaper();
    Person person();
}
