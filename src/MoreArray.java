import java.util.Arrays;

public class MoreArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        for (int counter = 0; counter < a.length-1;counter +=2){
          int temp = a[counter];
          a[counter] = a[counter + 1];
          a[counter + 1] = temp;
        }
        for (int num : a){
            System.out.print(num + " ");
        }


    }

}