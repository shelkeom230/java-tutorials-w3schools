public class prog2_variables {
    public static void main(String[] args) {
        /*
         * variables- container for storing the values
         * Data types:
         * 1. String
         * 2. int
         * 3. char
         * 4. float
         * 5. double
         * 6. boolean
         */

        // creating a variable
        String name = "omkar shelke";
        int rollNo = 50;
        int myNum; // declartion
        myNum = 100; // assign the value
        System.out.println(myNum);
        myNum = 1000; // changing the value
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(myNum);

        final int age = 18; // this value can't be changed.

        // other data types
        float myfloatNum = 1.5f;
        char myLetter = 'c';
        boolean isTrue = false;
        String myText = "engineer";

        System.out.println("The future of innovations are " + myText);

        String firstName = "vijay";
        String lastName = "Mishra";
        System.out.println(firstName + " " + lastName);

        // add to numbers
        int x = 5, y = 10;
        System.out.println(x + y);

        // declare value of same type, just seprate by commas
        float a = 10.5f, b = 100.45f, c = 90.11f;
        System.out.println(a + b + c);

        // same value to multiple variables
        int x1, y1, z1;
        x1 = y1 = z1 = 100;
        System.out.println(x1 + y1 + z1);

    }

}
