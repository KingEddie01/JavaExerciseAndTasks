import java.util.Scanner;

public class Chapter5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = input.nextInt();

        int maximum = number;
        int minimum = number;
        int counter;

        for (counter = 1; counter < 5; counter++) {

            System.out.print("Enter number : ");
            number = input.nextInt();

            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum){
                minimum = number;
            }

            }
        System.out.println("The maximum is : " + maximum);
        System.out.println("minimum number is  : " + minimum);
        }

    }













