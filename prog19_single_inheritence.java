class Vehicle {
    protected String brand = "ford";

    public void honk() {
        System.out.println("tuut, tuut");
    }
}

class Car extends Vehicle {
    public String modelName = "Mustang";
}

public class prog19_single_inheritence {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.honk();

        System.out.print(c1.brand + " " + c1.modelName + "\n");
    }

}
