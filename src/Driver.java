import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {


        Warehouse w = new Warehouse();

        List<String> validTypes = Arrays.asList("wagon", "jump rope", "barbie", "basketball hoop", "na");



        for ( int i = 0; i < 5; i++ ){
            Shelf s = new Shelf(validTypes.get(0));
            w.shelves.add(s);

        }
        for ( int i = 0; i < 5; i++ ){
            Shelf s = new Shelf(validTypes.get(1));
            w.shelves.add(s);


        }
        for ( int i = 0; i < 5; i++ ){
            Shelf s = new Shelf(validTypes.get(2));
            w.shelves.add(s);


        }
        for ( int i = 0; i < 5; i++ ){
            Shelf s = new Shelf(validTypes.get(3));
            w.shelves.add(s);


        }
        for ( int i = 0; i < 5; i++ ){
            Shelf s = new Shelf(validTypes.get(4));
            w.shelves.add(s);


        }



        for ( int i = 0; i < 10; i++ ){
            w.stockToy("wagon");
        }

        for ( int i = 0; i < 10; i++ ){
            w.stockToy("barbie");
        }
        for ( int i = 0; i < 15; i++ ){
            w.stockToy("basketball hoop");
        }



        w.print();

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner1.nextLine();
        System.out.println("Enter your company name");
        String companyName = scanner1.nextLine();

        System.out.println("Enter your email");

        String email = scanner1.nextLine();



        Vendor v = new Vendor(name, email, companyName);

        v.setActiveWarehouse(w);


        v.order();

        v.printCart();

        w.print();






    }
}