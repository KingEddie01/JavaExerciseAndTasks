package tdd;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, average = 0, sum = 0;


        while (counter < 10 ){
            System.out.print(" Enter score : ");
            int score = input.nextInt();
            sum += score;
            counter++;
        }
            average = sum/counter;
        System.out.print("The average is : "+ average );

    }




}
