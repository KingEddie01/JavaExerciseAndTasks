import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        switch (number % 2) {
            case 0 -> System.out.println("even");
            case 1 -> System.out.println("odd");
            default -> System.out.println("No number");
        }
    }






}



