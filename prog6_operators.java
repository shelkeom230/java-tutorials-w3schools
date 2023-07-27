public class prog6_operators {
    public static void main(String[] args) {
        /*
         * Types of operators
         * 1. arithmatic-->+,-,*,/,%,++,--
         * 2. assignment--> =,+=,-=,*=,/=,%=,&=,|=,^=,>>=,<<=
         * 3. comparison--> ==,<,>,<=,>=,!=
         * 4. logical-->&&,||,!
         * 5. bitwise
         */

        // arithmatic
        System.out.println(100 + 50);
        System.out.println(100 - 50);
        System.out.println(100 * 50);
        System.out.println(100 / 50);
        System.out.println(100 % 50);

        // increment and decrement
        int num = 50;
        System.out.println(num++);
        System.out.println(++num);

        System.out.println(num--);
        System.out.println(--num);

        // assignment
        int x = 5;
        System.out.println(x += 5);

        x &= 3;
        System.out.println(x);

        // comparison
        int a = 10, b = 55;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println();
        // logical operators
        System.out.println(a < 100 && b < 10);
        System.out.println(a < 100 || b < 10);
        System.out.println(!(a < 100 || b < 10));
    }

}
