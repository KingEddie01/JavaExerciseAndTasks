package tdd;
import java.util.Scanner;
public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1,sumOfEvenNUmber = 0,evenNUmberAverage = 0, evenCounter = 0;

        while (counter < 11) {
            System.out.print("Enter score : ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                sumOfEvenNUmber += score;
                evenCounter++;
            }
            counter++;
        }
        evenNUmberAverage = sumOfEvenNUmber/evenCounter;
        System.out.print("The even average  is : "+ evenNUmberAverage);
    }



}

