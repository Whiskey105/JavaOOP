import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Chip", 10.2, 1);
        Product product2 = new Product(2, "Kool-Aid", 15.0, 2);
        Product product3 = new Product(3, "Choco-bar", 13.9, 3);
        System.out.println(product1);

        Bottle bottle = new Bottle(4, "Mountain Dew", 9.99, 4, 0.33);

        HotDrink hotDrink1 = new HotDrink(5, "Coffee", 4.7, 5, 65);
        HotDrink hotDrink2 = new HotDrink(5, "Tea", 5.5, 6, 60);


        List<Product> ourList = new ArrayList<>();
        ourList.add(product1);
        ourList.add(product2);
        ourList.add(product3);
        ourList.add(bottle);
        ourList.add(hotDrink1);
        ourList.add(hotDrink2);


        Holder holder = new Holder();
        Display display = new Display();
        CoinDispenser coinDispenser = new CoinDispenser();

        VendingMachine machine = new VendingMachine(holder, display, coinDispenser, ourList);

        for (Product item : machine.getProducts()) {
            System.out.println(item);
        }



    }
    
}
