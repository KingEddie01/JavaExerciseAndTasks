import java.util.Scanner;
import java.security.SecureRandom;

public class RandomNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Random();}
    public static void Random() {
        SecureRandom randomNumber = new SecureRandom();
        System.out.println("Enter random number");
        int randomValue = input.nextInt();
        randomValue = randomNumber.nextInt(9);
        if (randomValue < 9) {
            Random();
        } else {
            System.out.println(" game over ");
        }
    }
}





