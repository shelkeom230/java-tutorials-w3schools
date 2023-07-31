class outClass {
    int x = 5;

    class innerClass {
        int y = 10;
    }

    // static inner class
    static class innerClass2 {
        int z = 50;

    }
}

class outerClass {
    int x = 10;

    class insideClass {
        int y = 20;

        public int myInnerMethod() {
            return y;
        }
    }
}

public class prog21_inner_classes {
    /*
     * purpose of inner class is to group similar classes together.
     * 
     * to access inner class, make an object of outer class and then create an
     * object of inner class.
     * 
     * declare the inner class as private if you don't wan't it to be accessible by
     * the outer class.
     */

    public static void main(String[] args) {
        // step1 - create an object of outer class
        outClass outer = new outClass();
        // step2- create an object of inner class
        outClass.innerClass inner = outer.new innerClass();
        System.out.println(inner.y + outer.x);

        outClass.innerClass2 inner2 = new outClass.innerClass2();
        System.out.println(inner2.z);

        outerClass out = new outerClass();

        outerClass.insideClass inside1 = out.new insideClass();
        System.out.println(inside1.myInnerMethod());
    }

}
