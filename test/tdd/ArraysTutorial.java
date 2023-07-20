package tdd;

import java.util.Arrays;

public class ArraysTutorial {
    public static void main(String[] args) {
        int [] numbers =  new int[10];
        for (int num = 0; num < numbers.length; num+=2){
            System.out.println();
            numbers[num] = 20;
        }
        System.out.println(numbers[4] = 2000);

        System.out.println(Arrays.toString(numbers));



    }

}
