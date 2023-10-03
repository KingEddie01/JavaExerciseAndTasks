import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void rotate(int [] a, int start, int end){

        while (start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println();
    }

    public static void result(int [] a, int k){
        k = k % a.length;
        if (k < 0){
            k+=a.length;
        }
        rotate(a,0,k-1);
        rotate(a,k,a.length-1);
        rotate(a,0,a.length-1);
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};

        for (int counter = 0; counter < a.length; counter++ ){
            System.out.print(a[counter]+ " ");
        }
        System.out.println();
        result(a, 4);
        for (int num = 0; num < a.length; num++){
            System.out.print(a[num]+" ");
        }
    }


    }





