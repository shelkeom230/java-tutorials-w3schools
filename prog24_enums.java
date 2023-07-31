/*
 * enum is a special class that represents a gourp of constants.
 * 
 * enum--> enumerations (specifically listed)
 */

public class prog24_enums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.LOW;
        System.out.println(myVar);

        switch (myVar) {
            case LOW:
                System.out.println("low");
                break;
            case HIGH:
                System.out.println("high");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;
            default:
                System.out.println(myVar);
        }

        // loop through an enum
        for (Level myvar : Level.values()) {
            System.out.println(myvar);
        }

    }

}
