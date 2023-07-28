public class prog12_methods {
    static void myMethod() {
        System.out.println("i just got executed.");
    }

    public static void main(String[] args) {
        myMethod();
        greet("omkar", 18);
        greet("devesh", 19);
        greet("vijay", 29);

        System.out.println(add(10, 11));

        checkAge(19);
    }

    /*
     * parameters- inside the method
     * arguments- passed in function call
     */

    static void greet(String name, int age) {
        System.out.println("good morning " + name);
        System.out.println(name + " is " + age + " years old");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("Access granted- you are old enough!");
        } else {
            System.out.println("access denied- you are not old enough!");
        }
    }
}
