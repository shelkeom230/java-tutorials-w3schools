public class prog10_loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // do while
        int i1 = 0;
        do {

            System.out.println(i1);
            i1++;
        } while (i1 < 5);

        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // for-each loop
        String cars[] = { "mercidiz", "baleno", "skoda", "audi" };
        for (String ele : cars) {
            System.out.println(ele);
        }

        // break statement
        for (int k = 0; k < 10; k++) {
            if (k == 5)
                break; // continue will skip one iteration.
            System.out.println(k);
        }
    }

}
