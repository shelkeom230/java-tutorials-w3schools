import java.util.ArrayList;
import java.util.function.Consumer;

public class prog37_lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.forEach((n) -> {
            System.out.println(n);
        });

        // store lambda expression in a variable
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface StringFunction {
    String run(String str);
}
