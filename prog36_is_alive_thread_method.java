/**
 * prog36_is_alive_thread_method
 */
public class prog36_is_alive_thread_method extends Thread {
    static int amount = 0;

    public static void main(String[] args) {
        /*
         * to avoid concurrency problem
         * make use of isAlive() method to check whether the thread has completed
         * execution or not
         * and then and then only allow the thread to change any attribute.
         */
        prog36_is_alive_thread_method obj = new prog36_is_alive_thread_method();

        obj.start();

        if (obj.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);

    }

    public void run() {
        amount++;
    }

}