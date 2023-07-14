package tdd;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int counter = 0, sum = 0, average = 0, total = 0;

       while (counter < 10){
           System.out.print("Enter score : ");
           int score = input.nextInt();
           sum += score;
           counter++;
       }
       average = sum/counter;
       total = average + sum;

        System.out.print("the total of sum and average is " + total);
    }







}
