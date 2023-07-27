public class prog4_datatypes {
    public static void main(String[] args) {
        /*
         * Data types are divided into groups:
         * 1. primitive- byte,short,int,long,float,double,boolean, char
         * 2. non-primitive- String,Arrays, classes
         * 
         * sizes
         * byte-1
         * short-2
         * int-4
         * long-8
         * float-4
         * double-8
         * boolean-1
         * char-2
         */

        /*
         * Numbers - Integer types(byte,short,int,long).
         * floating point types (float and double)
         */

        byte myNum = 100; // 1 byte
        System.out.println(myNum);
        System.out.println(Integer.SIZE / 8);
        System.out.println(Long.SIZE / 8);
        System.out.println(Character.SIZE / 8);
        System.out.println(Double.SIZE / 8);

        short num = 5000;
        System.out.println(num);

        int loanAmount = 4000000;
        System.out.println(loanAmount);

        long businessLoan = 100000000000L;
        System.out.println(businessLoan);

        float pointer = 9.4f;
        System.out.println(pointer);

        double per = 94.05d;
        System.out.println(per);

        // float precision- 6 or 7
        // double precision- 15

        // scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // boolean data type
        boolean isJavaFun = true;
        boolean ischickenTasty = false;
        System.out.println(isJavaFun);
        System.out.println(ischickenTasty);

        // char
        char myGrade = 'A';
        System.out.println(myGrade);

        // display char with ASCII values
        char myVal1 = 65, myVal2 = 66, myVal3 = 67;
        System.out.println(myVal1);
        System.out.println(myVal2);
        System.out.println(myVal3);

        // Strings
        String greetings = "good morning";
        System.out.println(greetings + " omkar");
    }
}
