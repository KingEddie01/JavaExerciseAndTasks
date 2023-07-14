package tdd;
import java.util.Scanner;
public class ReStart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        while (counter < 10 ){
            System.out.print("Enter score : ");
            int score = input.nextInt();
            if (score == 30){
                counter = 0;
                System.out.println("Enter score all over again : ");
            }
            counter++;





        }






    }




}
