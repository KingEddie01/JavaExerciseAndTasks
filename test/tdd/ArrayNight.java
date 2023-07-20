package tdd;

import java.util.Arrays;

public class ArrayNight {
    public static void main(String[] args) {
        double[] numbers = new double[8];
        int counter;
        for (counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = 7;


        }
        System.out.println(Arrays.toString(numbers));

        double[] number = new double[8];
        for (counter = 0; counter < number.length; counter++) {
            number[counter] = 7;


            if (counter % 2 != 0) {
                numbers[counter] = 7 - 1.5;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
