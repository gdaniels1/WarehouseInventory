import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warehouse {

/*
This is going to be the warehouse thyat's going to have all of the kids' toys



 */

    int numToys; // number of toys in the entire warehouse
    ArrayList<Shelf> shelves = new ArrayList<Shelf>();
    ArrayList<String> types = new ArrayList<String>(); // possible toy types that the warehouse can have
    // currently that is as follows: wagon, jump rope, barbie, basketball hoop
    // NOTE: THEREFORE EVERY TYPE OF SHELF HAS TO MATCH ONE OF THESE TYPES ABOVE, AS WELL AS THE TOYS

    // Toy playHouse = new Toy( "jump roperope");



    public Warehouse(){
        numToys = 0;

    }

    public void stockToy(String type){
        Toy t = new Toy(type);

        for ( int i = 0; i < shelves.size(); i++ ){
            if ( t.type.equals( shelves.get(i).typeOfShelf) && shelves.get(i).CAP <= 20 ){
                shelves.get(i).toys.add(t);
                return;
            }
        }


    }

    public Toy removeToy(String type) {
        boolean valid = validateType(type);
        if (valid) {
            for (int i = 0; i < shelves.size(); i++) {
                if (type.equalsIgnoreCase(shelves.get(i).typeOfShelf)) {
                    Toy t = shelves.get(i).removeItem(type);
                    return t;

                }
            }
        } else {
            return null;
        }
        return null;
    }


    public void deleteShelf(String type ){
        boolean valid = validateType(type);
        if ( valid ){
            for ( int i = 0; i < shelves.size(); i++ ){
                if ( type.equalsIgnoreCase(shelves.get(i).typeOfShelf) ){
                    shelves.remove( shelves.get(i));

                }
            }
        }

    }

    public void print(){
        System.out.println("Showing Warehouse Inventory");

        int total = 0;
        for ( int i = 0; i < shelves.size(); i++ ){
            total += shelves.get(i).toys.size();
        }
        System.out.println("Total number of warehouse items: " + total);
        for ( int i = 0; i < shelves.size(); i++ ){
            shelves.get(i).print();
        }
    }


    public static boolean validateType(String type){

        // WAgon


        List<String> validTypes = Arrays.asList("wagon", "jump rope", "barbie", "basketball hoop");

        for ( int i = 0; i < validTypes.size(); i++ ){
            if ( type.equals(validTypes.get(i))){
                return true;
            }
        }
        return false;

    }

}
