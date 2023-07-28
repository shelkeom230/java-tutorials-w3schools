public class prog11_arrays {
    public static void main(String[] args) {
        String[] cars = { "rales royce royal", "skoda", "mercidiz benz", "renault kiger" };
        int[] myNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(cars[0]);
        System.out.println(myNum[0]);

        // alter teh element
        cars[0] = "renault climber";
        System.out.println(cars[0]);

        System.out.println(cars.length);
        System.out.println(myNum.length);
        System.out.println();

        // traverse teh array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();

        // foreach loop
        for (String i : cars) {
            System.out.println(i);
        }

        // multi-dimenhsihonal arrays
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] myBuilding = { { 101, 102, 103 }, { 201, 202, 203 } };
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < myBuilding.length; i++) {
            for (int j = 0; j < myBuilding[i].length; j++) {
                System.out.print(myBuilding[i][j] + " ");
            }
            System.out.println();
        }

    }
}
