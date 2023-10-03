import java.util.Arrays;

public class FemiTask {
    static void change(int[] a, int num1, int num2) {
        for (int counter = 0; counter < a.length; counter++) {
            int sum = a[num1] + a[num2];
            if (counter == num1) {
                a[counter] = a[num2];
            }
            a[num1] = sum - a[num2];
        }
        System.out.print(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int [] a = {5,2,6,10,9,3};
        for (int counter = 0; counter < a.length; counter++ ) {
            System.out.print(a[counter] + " ");
        }

        change(a, 2,4);
        for (int fig : a){
            System.out.println(Arrays.toString(a));

        }


    }

}

