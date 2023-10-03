import java.util.Scanner;

public class Downstairs2 {
    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        digitToLetter();
    }
    public static void digitToLetter(){
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        switch (number){
            case 1 -> {
                System.out.println("one");
                break;
            }
            case 2 -> {
                System.out.println(("Two"));
                break;

            }
            case 3 -> {
                System.out.println("Three");
                break;
            }
            case 4 -> {
                System.out.println(("Four"));
                break;
            }
            case 5 -> {
                System.out.println("Five");
                break;
            }
            case 6 -> {
                System.out.println(("Six"));
                break;

            }
            case 7 -> {
                System.out.println("Seven");
                break;
            }
            case 8 -> {
                System.out.println(("Eight"));
                break;
            }
            case 9 -> {
                System.out.println("Nine");
                break;
            }
            case 10 -> {
                System.out.println(("Ten"));
                break;
            }
            default-> {
                System.out.println("Enter a number from range 1 - 10");
                digitToLetter();
            }






        }




    }
}
