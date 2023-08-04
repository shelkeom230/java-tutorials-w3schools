public class prog33_try_catch {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acess denied- age is less than 18");
        } else {
            System.out.println("Acess granted- you are old enough !");
        }
    }

    public static void main(String[] args) {
        /*
         * try- the code that can throw an exception
         * catch- code to handle the exception
         * finally- code that will always be executed unless there is an exception or
         * not
         */

        // ArrayIndexOutOfBoundsException e.g
        try {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;

            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("done");
        }

        /*
         * throw statement allows you to create a custom error.
         * used together with an exception type.
         * Types of exception
         * 1. ArithmaticException
         * 2. FileNotfoundException
         * 3. ArrayIndexOutOfBoundsException
         * 4. SecurityException
         */

        // using example of age
        checkAge(1);
    }
}
