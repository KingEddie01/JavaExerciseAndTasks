package tdd;
import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1,sumOfEvenCounter = 0;
        while (counter < 11) {
            System.out.print("Enter score : ");
            int score = input.nextInt();
            if (counter % 2 == 0) {
                sumOfEvenCounter += score;
            }
            counter++;
        }
        System.out.print("Total of even is : "+ sumOfEvenCounter);
    }



}


























































