import java.security.SecureRandom;

public class NewRandom {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();


        for (int counter = 1; counter < 10; counter++) {
            int value = randomNumber.nextInt(2);
            System.out.print(value);

            if (counter % 2 == 0) {
                System.out.println();
            }
        }
    }
}
