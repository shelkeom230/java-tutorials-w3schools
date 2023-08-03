import java.util.HashMap;

public class prog29_hashmap {
    public static void main(String[] args) {
        /*
         * stores item in key/value pairs, and can be accessed by an index of another
         * type (Stromg)
         * 
         * One object is used as a key(index) to another object(value).
         */

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "oslo");
        capitalCities.put("india", "delhi");
        capitalCities.put("USA", "washington DC");

        System.out.println(capitalCities);

        // accessing an item
        System.out.println(capitalCities.get("england"));
        System.out.println(capitalCities.get("india"));

        // remove an item
        capitalCities.remove("USA");
        System.out.println(capitalCities);

        /*
         * remove all elements
         * capitalCities.clear();
         */

        // print the size
        capitalCities.size();

        // loop through the elements
        /* use keySet() method for keys only and values() for values only */
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.println();
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        System.out.println();

        // print both
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " values: " + capitalCities.get(i));
        }

        /* keys and values in hasmap are objects */

        // create a hashMap called people that will string keys and iteger values. (name
        // and age of persons)

        HashMap<String, Integer> Person = new HashMap<String, Integer>();
        Person.put("Omkar shelke", 21);
        Person.put("Devesh Patil", 22);
        Person.put("Ishan Sharma", 20);

        for (String i : Person.keySet()) {
            System.out.println("key: " + i + " values: " + Person.get(i));
        }

    }
}
