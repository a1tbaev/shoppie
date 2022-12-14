import classes.MyException;
import classes.Shop;
import enums.Accessories;
import enums.Shops;
import shopImple.ShopImple;

import java.util.*;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        ShopImple shopImple = new ShopImple();
        while (true){
            System.out.println("""
                    1 -> create person
                    2 -> create shop
                    3-> all shop
                    4 -> get all accessories
                    5 -> buy something
                    6 -> find accessories by name
                    7 -> sort by price
                    8 -> filter by price
                    9 -> check package
                    10-> sort all
                    11-> person
                    """);
            switch (scanner.nextInt()) {
                case 1 -> System.out.println(shopImple.createPerson());
                case 2 -> System.out.println(shopImple.createShop());
                case 3 -> System.out.println(shopImple.allShops());
                case 4 -> System.out.println(shopImple.getAllAccessories());
                case 5 -> shopImple.buySomething();
                case 6 -> System.out.println(shopImple.findByNameAccessories());
                case 7 -> System.out.println(shopImple.sortByPrice());
                case 8 -> System.out.println(shopImple.filterByPrice());
                case 9 -> shopImple.checkPackage();
                case 10 -> System.out.println(shopImple.findCheaper());
                case 11 -> System.out.println(shopImple.person());
            }
        }

    }
}