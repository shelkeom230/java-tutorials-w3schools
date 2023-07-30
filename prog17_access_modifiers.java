/*
 * Access modifiers - defines accessibility of class properties and methods inside a program (controls the access level)
 * 
 * public- accessible by any other class 
 * default- accessbile by classes in the same package. this is used when you don't specify a modifier.
 * private- code is only accessible in the declared class.
 * protected- code is accessible in the declared as well as child classes.
 * 
 * 
 * NON-ACCESS MODIFIERS 
 * final- cannot be inherited by other classes
 * abstract- cannot be used to create objects, can only be inherited.
 *  
 * for attributes and methods 
 * 1. final- cannot be overriden /modified.
 * 2. static- belong to the class, rather than object.
 * 3. abstract- methods with no body. 
 * 4. transient- attr and methods are skipped when searializing the object containing them.
 * 5. synchronized- methods can only be accessed by one thread at a time.
 * 6. volatile- value of an attribute is cached thread-locally, and is always read form the main memory.  
 * 
 */
abstract class StudentInfo {
    public String name = "omkar shelke";
    public int age = 21;
    public String branch = "cse";

    public abstract void study();
}

class Omkar extends StudentInfo {
    public int graduationYear = 2027;

    public void study() {
        System.out.println(
                "studied computer science and engineering with advance interest in data science and blockchain.");
    }
}

public class prog17_access_modifiers {
    public static void main(String[] args) {
        Omkar o1 = new Omkar();
        System.out.println(o1.name);
        System.out.println(o1.age);
        System.out.println(o1.branch);
        System.out.println(o1.graduationYear);
        o1.study();
    }
}
