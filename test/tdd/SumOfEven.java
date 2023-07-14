package tdd;
import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1,sumOfEvenNumber= 0;
        while (counter < 11) {
            System.out.print("Enter score : ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                sumOfEvenNumber+= score;
            }
            counter++;
        }
        System.out.print("Total of even is : "+ sumOfEvenNumber);
    }



}

