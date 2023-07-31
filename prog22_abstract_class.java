abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzzz");
    }
}

class pig extends Animal {
    public void animalSound() {
        System.out.println("the pig says wee wee");
    }
}

public class prog22_abstract_class {
    /*
     * abstract class- restricted class that cannot be inerited.
     * abstract method- only available in abstract class, and it does not have a
     * body. body is provided by child class.
     * 
     * abstract class can have both abstract and regular methods.
     */
    public static void main(String[] args) {
        pig p1 = new pig();
        p1.animalSound();
        p1.sleep();
    }
}
