import java.util.Scanner;

public class Divisible {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        isDivisible();


    }

    public static void isDivisible() {
        int counter = 0;
        while (counter <= 10) {
            System.out.println("Enter Number : ");
            int number = input.nextInt();
            if (number % 5 == 0) {
                System.out.println("True");
            } else {
                System.out.println("false");
            }
            counter++;
            System.out.println("Counter is ,"+ counter);
        }

    }
}