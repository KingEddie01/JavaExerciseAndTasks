package tdd;

import java.util.Arrays;

import static java.lang.Math.E;

public class ArrayNigeria2 {
    public static void main(String[] args) {
        char[] letter = new char[10];
        letter[9] = 'E';
        System.out.println(Arrays.toString(letter));

        for (int counter = 0; counter < letter.length; counter++){

            if (counter % 2 != 0) letter[counter] = 'A';
        }
        System.out.println(Arrays.toString(letter));
        for (int counter = 0; counter < letter.length; counter++){

            if (counter % 2 == 0) letter[counter] = 'L';
        }
       letter [2] = 'F';
        System.out.println(Arrays.toString(letter));
        for (int counter = 0; counter < letter.length; counter++){

            letter[counter] = '5';
        }
        System.out.println(Arrays.toString(letter));









    }

}


