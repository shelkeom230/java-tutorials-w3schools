class amountClass extends Thread {
    int amount = 0;

    public void run() {
        amount++;
    }
}

public class prog35_java_threads extends Thread {
    public static void main(String[] args) {
        /*
         * threads allow a program to operate more efficiently by doing multiple things
         * at the same tim.e
         * 
         * can be used to perform tasks in background without interrupting main program.
         * 
         * 2 ways to create a thread
         * 1) extending from thread class and overriding run method
         * 2) implementing the runnable interface
         */

        // 1. extending from Thread class
        prog35_java_threads obj1 = new prog35_java_threads();
        obj1.start();
        System.out.println("the code is outside of the thread.");

        prog35_java_threads obj2 = new prog35_java_threads();
        Thread thd = new Thread(obj2);
        thd.start();
        System.out.println("the code is outside of the thread.");

        amountClass amtc = new amountClass();
        amtc.start();
        System.out.println(amtc.amount);
        amtc.amount++;
        System.out.println(amtc.amount);
    }

    public void run() {
        System.out.println("the thread is running.");
    }
}

class ThreadClass implements Runnable {
    public void run() {
        System.out.println("i have created thread with runnable interface.");
    }
}