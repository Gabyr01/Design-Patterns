package JavaHashSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        //check if an item exists 
        System.out.println(cars.contains("Mazda"));

        //remove item 
        cars.remove("Volvo");
        System.out.println(cars);

        //remove all
        // cars.clear();

        //size
        System.out.println(cars.size());

        //FOR EACH loop
        for (String i : cars) {
            System.out.println(i);
        }

        
      }
}
