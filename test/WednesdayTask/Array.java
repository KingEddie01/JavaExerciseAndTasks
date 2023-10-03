package WednesdayTask;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
    reArrange();
    }
    public static void reArrange(){
        int [] numbers = {1,2,3,4,5,6};
        int [] new_number = new int[numbers.length];
        numbers = new int[]{1, 2, 3, 4, 5, 6};
        for (int counter = 0; counter< numbers.length-1; counter+=2){
            new_number = new int[]{numbers[counter]};
            System.out.print(Arrays.toString(new_number));



        }


    }


        }


