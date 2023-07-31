/*
 * completely abstract class that is used to group related methods and empty
 * bodies.
 * 
 * you must override all the methods in the interface on implementation.
 * intreface methods are by default - abstract and public.
 * interface attributes are by default- public,static and final.
 * an interface cannot contain a constructor.
 * with interfaces , we can achieve multiple inheritence in java.
 * Note- to implement multiple interface , seprate them with a comma.
 * 
 */
interface firstInterface {
    public void firstMethod();
}

interface secondInterface {
    public void secondMethod();
}

interface Animal {

    public void animalSound();

    public void run();
}

class dog implements Animal {
    public void animalSound() {
        System.out.println("dog barks");
    }

    public void run() {
        System.out.println("dog runs very fastyly");
    }
}

class horse implements Animal {
    public void animalSound() {
        System.out.println("horse is telling something");
    }

    public void run() {
        System.out.println("horse is runing faster than wind.");
    }
}

class DemoClass implements firstInterface, secondInterface {
    public void firstMethod() {
        System.out.println("method 1");
    }

    public void secondMethod() {
        System.out.println("method 2");
    }
}

public class prog23_interfaces {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.animalSound();
        d1.run();

        horse h1 = new horse();
        h1.animalSound();
        ;
        h1.run();

        DemoClass myobj = new DemoClass();
        myobj.firstMethod();
        myobj.secondMethod();
    }
}
