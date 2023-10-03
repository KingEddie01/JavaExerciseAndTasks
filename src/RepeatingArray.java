import java.util.Arrays;
import java.util.Scanner;

public class RepeatingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[7];
        int [] b = new int[a.length];
        System.out.println("Enter elements of array");
        for (int count = 0; count < a.length; count++){
            a[count] = input.nextInt();
            b[count] = a[count];
        }
        System.out.println("Elements of Array a " +" "+Arrays.toString(a));
        System.out.println();
        System.out.println("Elements of Array b " +" "+Arrays.toString(b));


    }
}
