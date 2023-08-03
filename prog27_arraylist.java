import java.util.ArrayList;
import java.util.Collections;

public class prog27_arraylist {
    public static void main(String[] args) {
        /* arraylist is a dynamic array */
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Range rover");
        cars.add("Rales Royce royal");
        System.out.println(cars);

        // accessing an element
        System.out.println(cars.get(1));

        // change an item
        cars.set(0, "BALENO");

        // remove an item
        cars.remove(0);

        /*
         * remove all the elements
         * cars.clear()
         */

        // print the size
        cars.size();

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " , ");
        }
        System.out.println();

        // using for each loop
        for (String i : cars) {
            System.out.println(i);
        }

        /*
         * elements in arraylist are actually objects.
         * String in java is class.
         */

        // creating an arraylist to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(41);
        numbers.add(50);
        numbers.add(18);

        for (int i : numbers) {
            System.out.println(i);
        }

        // sorting all the numbers with collections class
        Collections.sort(cars);
        Collections.sort(numbers);
        System.out.print(cars + " ,  ");
        System.out.print(numbers + " ,  ");
    }
}
