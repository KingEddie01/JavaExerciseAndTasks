package tdd;
import java.util.Scanner;
public class NightClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int firstNumber = input.nextInt();
         if (firstNumber % 5 ==0 && firstNumber % 6 == 0){
             System.out.printf("Is %d divisible by 5 and 6? true",firstNumber);
         }
         else {
                 System.out.printf("Is %d divisible by 5 and 6? false", firstNumber);
             }
         if (firstNumber % 5 == 0 || firstNumber % 6 == 0){
             System.out.printf("%nIs %d divisible by 5 or 6? true",firstNumber);
         }
         else{
             System.out.printf("%nIs %d divisible by 5 or 6? false",firstNumber);
         }
         if (firstNumber % 5 == 0 || firstNumber % 6 == 0){
             System.out.printf("%nIs %d divisible by 5 and 6, but not both? true", firstNumber);
         }
         else{
             System.out.printf("%nIs %d divisible by 5 and 6, but not both? false", firstNumber);
         }














    }

}
