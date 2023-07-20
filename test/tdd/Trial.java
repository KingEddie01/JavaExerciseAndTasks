package tdd;
import java.util.Scanner;
public class Trial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int N = input.nextInt();

        if (N % 2 != 0){
                    System.out.print("weird");
                }
        else if (N >= 2 && N <= 5){
                    System.out.print("Not weird");
                }
        else if (N >= 6 && N <= 20){
                    System.out.print("weird");
                }
        else if (N > 20){
                    System.out.println("not weird");
                }
        else{
                    System.out.println();
                }
            }
}
