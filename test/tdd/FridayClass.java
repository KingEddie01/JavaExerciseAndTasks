package tdd;
import java.util.Scanner;
public class FridayClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System .in);
        int counter = 0,sum = 0;


        while (counter < 10 ){
            System.out.print("Enter score : ");
            int score = input.nextInt();

            sum += score;
            counter++;
            System.out.print("The sum is : "+ sum);




        }


    }









}
