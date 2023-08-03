import java.util.HashSet;

public class prog30_hashset {
    public static void main(String[] args) {
        /*
         * hashset is a collection of elements where every element is unique, and it is
         * found in java.util package.
         */

        HashSet<String> cars = new HashSet<String>();

        // add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Rales Royce Royal");
        cars.add("BALENO");
        cars.add("Ford");

        System.out.println(cars);

        // check if an item exists
        System.out.println(cars.contains("Volvo"));

        // remove an item
        cars.remove("Volvo");

        /*
         * remove all items
         * cars.clear();
         */

        // print the size
        System.out.println(cars.size());

        for (String i : cars) {
            System.out.println(i);
        }

        /* items in a hashset are objects */

        // use hashset that stores integer objects
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(10);
        numbers.add(11);
        numbers.add(12);

        for (int i : numbers) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }
    }
}
