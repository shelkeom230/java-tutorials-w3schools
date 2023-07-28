class Main {
    int x;

    public void myPublicMethod() {
        System.out.println("public method requires creation of object for access.");
    }
}

class infoForm {
    String fname = "omkar";
    String lname = "shelke";
    int age = 18;
}

public class prog14_classes_objects {
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.x = 50;
        System.out.println(m1.x);

        m1.myPublicMethod();
        myStaticMethod();

        // m1.y = 10; // generates error as y is final.
        infoForm if1 = new infoForm();
        System.out.println("name: " + if1.fname + " " + if1.lname);
        System.out.println("age: " + if1.age);
    }

    private static void myStaticMethod() {
        System.out.println("static method can be accessed by directly without creating object of a class.");
    }
}
