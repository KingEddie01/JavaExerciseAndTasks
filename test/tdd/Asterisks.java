package tdd;

public class Asterisks {
    public static void main(String[] args) {
        int line = 10;

        for (int row = 1; row <= line; row++) {
            for (int column = 1; column < row; column++) {

                System.out.print("*");
            }
            for (int column = row; column <= line; column++) {
                System.out.println("$");
            }

        }
            System.out.println();









    }





}
