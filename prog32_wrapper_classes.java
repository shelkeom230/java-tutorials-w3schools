public class prog32_wrapper_classes {
    public static void main(String[] args) {
        /*
         * Wrapper classes provide a way to use primitive data types as objects
         * int Integer
         * char Character
         * byte Byte
         * short Short
         * long Long
         * float Float
         * double Double
         * boolean Boolean
         */

        // creating wrapper objects
        Integer myInt = 50;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println();

        // get the values
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // convert into string
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
