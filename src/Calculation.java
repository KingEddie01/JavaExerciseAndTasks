import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        if (number % 2 != 0){
            System.out.println("its an even number");
        }
        else{
            System.out.println("its an odd number");
        }


    }
}
