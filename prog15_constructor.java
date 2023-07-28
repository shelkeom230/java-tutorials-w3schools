class Car {
    String model;
    int price;

    Car() {
        model = "kia";
        price = 800000;
    }

    Car(int y, String model) {
        this.model = model;
        price = y;
    }
}

class FordMustang {
    String modelName;
    int modelYear;

    FordMustang(String modelName, int modelYear) {
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

}

public class prog15_constructor {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.print(car1.model + " " + car1.price);
        System.out.println();

        Car car2 = new Car(100000, "BMW");
        System.out.println(car2.model + " " + car2.price);

        FordMustang fm1 = new FordMustang("mustang", 1969);
        FordMustang fm2 = new FordMustang("tata", 2010);
        System.out.println(fm1.modelName + " " + fm1.modelYear);
        System.out.println(fm2.modelName + " " + fm2.modelYear);
    }
}