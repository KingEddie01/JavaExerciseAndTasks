import java.util.Scanner;

public class Palindrome {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void isPalindrome(){
        System.out.println("Enter a five digit Number : ");
        int number = input.nextInt();
        int firstNumber = number/10000;
        int secondNumber = (number / 1000) % 10;
        int thirdNumber = (number / 100) % 10;
        int fourthNumber = (number / 10) % 10;
        int fifthNumber = (number % 10);
        if (firstNumber == fifthNumber && secondNumber == fourthNumber){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not a Palindrome");
        }
    }
}
