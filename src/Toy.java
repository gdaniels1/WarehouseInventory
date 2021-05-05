public class Toy {


    String type; // ex: wagon, basketball hoop, jump rope, barbies

    public static int maxId = 0; //
    public int id;

    public Toy(String type){

        id = maxId;
        maxId++;
        String s = type.toLowerCase();
        boolean isValid = Warehouse.validateType(s);
        if ( isValid ){
            this.type = s;

        }
        else{
            this.type = "na";
        }



    }

    public void print(){
        System.out.println( "ID: " + id + "/ " +  type );
    }


}