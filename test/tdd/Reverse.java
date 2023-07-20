package tdd;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = input.next();

        char[] wordArray = word.toCharArray();
        int start = wordArray.length - 1;

        for(int num = start; num >= 0 ; num--) {
            System.out.print(wordArray[num]);
        }
        System.out.println();


        }
}
