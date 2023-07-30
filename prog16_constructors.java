class Main {
    int x;

    Main() {
        x = 5;
    }

    Main(int y) {
        x = y;
    }

    void printX() {
        System.out.println(x);
    }
}

class Car {
    String modelName;
    int modelYear;

    Car(String mname, int myear) {
        modelName = mname;
        modelYear = myear;
    }
}

public class prog16_constructors {
    public static void main(String[] args) {
        /*
         * constructor is a special method with same name as class and used to
         * initialize object of a class for first time
         * 
         * it is called when an object of a class is created.
         * 
         * the compile always calls a default constructor irrespective of their is a
         * constructor present or not.
         * 
         * no returntype and even not void as well.
         */

        Main m1 = new Main();
        m1.printX();

        Main m2 = new Main();
        m2.x = 10;
        m2.printX();

        Main m3 = new Main(55);
        m3.printX();

        Car c1 = new Car("ford mustang", 1969);
        System.out.println(c1.modelName + " " + c1.modelYear);
    }
}
