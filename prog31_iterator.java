import java.util.ArrayList;
import java.util.Iterator;

public class prog31_iterator {
    public static void main(String[] args) {
        /*
         * used to loop through collections, like ArrayList and HashSet. it is called
         * iterator as iterating is the technical term of looping
         */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // get the iterator
        Iterator<Integer> iter = numbers.iterator();

        System.out.println(iter.next());

        // looping through a collection
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // removing items
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i < 3) {
                iter.remove();
            }
            System.out.println(numbers);
        }

    }
}
