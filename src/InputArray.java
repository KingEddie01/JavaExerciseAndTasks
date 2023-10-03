import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[2];
        System.out.println("Enter Student score");
        for (int counter = 0; counter < score.length; counter++) {
            score[counter] = input.nextInt();
            System.out.println();}
            System.out.println(Arrays.toString(score));
            System.out.println();

        }
    }





