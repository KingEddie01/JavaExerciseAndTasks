
package tdd;
import java.util.Scanner;
public class ValidNumberEnter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0,sum = 0;

        while (counter < 10) {
            System.out.print("Enter score : ");
            int  score = input.nextInt();
            if (score >= 0 && score <= 100) {

                counter++;
            }
            else {
                System.out.println("invalid score");
            }
        }


    }

}
