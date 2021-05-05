import java.util.ArrayList;

public class Shelf {

    final int CAP = 20; // number of items that can be heled
    String typeOfShelf; // THIS HAS TO MATCH THE POSSIBLE TYPES OF TOYS THAT WE HAVE

    ArrayList<Toy> toys = new ArrayList<Toy>();



    public Shelf(String type){ // type will be one of the toy types that our warehouse has
        String s = type.toLowerCase();
        boolean isValid = Warehouse.validateType(s);
        if ( isValid ){
            typeOfShelf = s;

        }
        else{
            typeOfShelf = "na";
        }


    }

    public Toy removeItem(String type){
        if ( toys.size() > 0 ){
            if ( type.equalsIgnoreCase(typeOfShelf) ){
                Toy t = toys.remove(0);
                return t;
            }
        }

        return null;

    }

    public void print(){
        for ( int i = 0; i < toys.size(); i++ ){
            toys.get(i).print();
        }
    }


    // toy A: wagon
    // shelf A: Wagon





}