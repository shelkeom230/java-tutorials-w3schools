public class prog5_typecasting {
    public static void main(String[] args) {
        /*
         * type casting
         * 1. widening (automatic) type casting conveting a smaller type to a larger
         * type
         * byte->short->char->int->long->float->double
         * 
         * 2. Narrowing type casting (manual)
         * converting a larger type into smaller type
         * double->float->long->int->char->short->byte
         * 
         */

        // widening type casting
        // int to double
        int age = 18;
        double doubleAge = age;
        System.out.println(age); // 18
        System.out.println(doubleAge); // 18.0

        // narrowing type casting
        // double to int
        double myDouble = 9.7d;
        int myInt = (int) myDouble;
        System.out.println(myInt); // 9
    }
}