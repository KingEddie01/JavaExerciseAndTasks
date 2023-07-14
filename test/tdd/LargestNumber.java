package tdd;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0,largest = 0;


        while (counter < 10) {
            System.out.print("Enter Number : ");
            int number = input.nextInt();
            if (number > largest){
                largest = number;
            }
            counter++;

       }
        System.out.println("largest number is "+ largest);

    }

}




