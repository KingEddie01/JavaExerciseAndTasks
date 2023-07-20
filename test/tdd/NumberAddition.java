package tdd;

import java.util.Arrays;

public class NumberAddition {
    public static int[] addTotal(int[] number) {

        int[] sum = new int[number.length];

        for (int counter = 0; counter < number.length; counter++) {
            int total = 0;
            for (int num = 0; num < number.length; num++) {
                if (counter != num) {
                    total += number[num];



                }


            }
            sum[counter] = total;


        }

        return sum;

    }

}






















