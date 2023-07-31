import java.util.Scanner;

public class prog25_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username: ");
        String username = sc.nextLine();

        System.out.println("username is: " + username);

        System.out.println("enter age: ");
        int age = sc.nextInt();
        System.out.println("enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("name: " + username + " age: " + age + " salary: " + salary);
    }
}
