import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vendor {


    /*

    These are the people who are going to be buying the toys from the warehouse
     */

    String name;
    String companyName;
    String email;

    Warehouse activeWarehouse = null;



    ArrayList<Toy> toyCart= new ArrayList<Toy>();

    public Vendor( String name ){
        this.name = name;
    }

    public Vendor( String name, String email ){
        this.name = name;
        this.email = email;
        this.companyName = companyName;
    }
    public Vendor( String name, String email, String companyName ){
        this.name = name;
        this.email = email;
        this.companyName = companyName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public void setActiveWarehouse(Warehouse w ){
        activeWarehouse = w;
    }


    public void order(){

        String input = "";
        while ( input.equalsIgnoreCase("q") == false ){
            System.out.println("Welcome to the warehouse. Please say what you would like to order: Wagon  , Barbie, Basketball Hoop , Jump Rope or Q to quit ");

            List<String> validInputs = Arrays.asList("wagon", "jump rope", "barbie", "basketball hoop");

            Scanner s = new Scanner(System.in);



            String line = s.nextLine();

            line = line.trim();
            if ( line.equalsIgnoreCase("q")) {
                return;
            }

            for ( int i = 0; i < validInputs.size(); i++ ){
                if ( line.equalsIgnoreCase(validInputs.get(i))){
                    System.out.println("How many of this item would you like?");
                    int num = s.nextInt();
                    for ( int j = 0; j < num; j++ ){
                        Toy t = activeWarehouse.removeToy(line);
                        toyCart.add(t);
                    }
                }
                else{
                }
            }


        }


    }


    public void printCart(){
        System.out.println("PRINTING CART FOR " + name + " Email: " + email + " Company Name: " + companyName);
        for ( int i = 0; i < toyCart.size(); i++ ){
            System.out.println("Item " + ( i + 1 ) + ": " + toyCart.get(i).type);
        }
    }
}
