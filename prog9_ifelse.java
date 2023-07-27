public class prog9_ifelse {
    public static void main(String[] args) {
        int time = 20;
        if (time > 18) {
            System.out.println("time is greter than 18");
        } else {
            System.out.println("time is less than 18");
        }

        // if else ladder
        int marks = 94;
        if (marks >= 90 && marks <= 100) {
            System.out.println("grade A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("grade B");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("grade C");
        } else {
            System.out.println("grade D");
        }

        // ternary operator -shorthand if else
        int age = 18;
        String result = (age > 18) ? "gentleman" : "children";
        System.out.println(result);

        // switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day number");
        }
    }
}
