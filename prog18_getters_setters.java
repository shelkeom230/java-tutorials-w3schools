class Person {
    String name, city;

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

}

public class prog18_getters_setters {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("omkar shelke");
        p1.setCity("Amravati");

        Person p2 = new Person();
        p2.setName("riddhi datta");
        p2.setCity("kolkata");

        System.out.println(p1.getName());
        System.out.println(p1.getCity());

        System.out.println(p2.getName());
        System.out.println(p2.getCity());
    }

    /*
     * encapsulation - hiding sensitive data from end users.
     * 
     * benefits-
     * 1. better control of class attributes and methods
     * 2. class attributes can be made read-only or write-only using getters and
     * setters resp.
     * 3. flexible : the programmer can change one part of code without affecting
     * other parts.
     * 4. increased security of data.
     */

}
