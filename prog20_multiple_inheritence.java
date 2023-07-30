class animal {
    public void animalSound() {
        System.out.println("the animal makes a sound.");
    }
}

class dog extends animal {
    public void animalSound() {
        System.out.println("Bark");
    }
}

class cat extends animal {
    public void animalSound() {
        System.out.println("miyau");
    }
}

public class prog20_multiple_inheritence {
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.animalSound();

        dog d1 = new dog();
        d1.animalSound();

        cat c1 = new cat();
        c1.animalSound();
    }
}