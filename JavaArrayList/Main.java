package JavaArrayList;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class


public class Main {
 

    public static void main(String[] args) {
        //object called cars that will store strings:
        ArrayList<String> cars = new ArrayList<String>();// Create an ArrayList object
       //add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Alpine");
        System.out.println(cars);

        //access an item 
        String first = cars.get(0); //# is index number
        System.out.println(first);

        //change an item 
        cars.set(0, "Opel");
        System.out.println(cars);

        //remove an Item
        cars.remove(0);
        System.out.println(cars);

        //array size 
        int size = cars.size();
        System.out.println(size);

        //for-loop 
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //////
        System.out.println("------------------");
        //////

        //sort() method for sorting lists alphabetically or numerically
        Collections.sort(cars);  // Sort cars


        //for-each loop 
        for(String i : cars) {
            System.out.println(i);
        }


      
    }
}
