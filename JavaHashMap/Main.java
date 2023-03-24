package JavaHashMap;

import java.util.HashMap; // import the HashMap class

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
    
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
      
        //To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(capitalCities.get("England"));

        //remove
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //remove all items
        // capitalCities.clear();

        //size
        capitalCities.size();

        //for each loop
        // Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
          }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }    
}
