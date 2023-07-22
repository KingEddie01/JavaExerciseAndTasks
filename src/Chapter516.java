import java.util.Scanner;

public class Chapter516 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter  <= 5; counter++){
            System.out.print("Enter Number : ");
            int number = input.nextInt();
            if (number >= 1 && number <= 30){
                System.out.println(number + "*".repeat(number));
            }
            else {
                break;
            }
            System.out.println();

        }



    }

}
