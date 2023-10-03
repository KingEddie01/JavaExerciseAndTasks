import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(a));
        System.out.println();
        for (int num = 1; num < a.length - 1; num++) {
                a[num] = a[num + 1];
            }
            System.out.println(Arrays.toString(a));

        }


    }

