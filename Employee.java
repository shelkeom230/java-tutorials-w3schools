
public class Employee {
    String name, desg;
    int age;

    Employee(String name, int age, String desg) {
        this.name = name;
        this.age = age;
        this.desg = desg;
    }

    void getDetails() {
        System.out.println(name + " " + age + " " + desg);
    }

    public static void main(String[] args) {

    }
}
