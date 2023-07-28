public class prog13_method_overloading {
    // method overloading -multiple methods can have same name with different
    // parameters

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(plusMethod(10, 11));
        System.out.println(plusMethod(10.10, 11.13));

        System.out.println(sum(5));
        System.out.println(sum(1, 10));
    }

    /*
     * Java scope- variables are accessible inside the region they are created. the
     * is called as scope.
     * 
     * Method scope -
     * variables are declared directly inside a method are available anywhere in the
     * method following the line of code in which they are declared.
     * 
     * Block scope-
     * all the code between curly braces {}.
     *
     */

    // recursion
    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // add all the numbers between 5 and 10 using recursion
    static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
