public class prog15_access_employee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("omkar shelke", 18, "data scientist");
        Employee emp2 = new Employee("devesh patil", 20, "sde 2");
        emp1.getDetails();
        emp2.getDetails();

    }

}
