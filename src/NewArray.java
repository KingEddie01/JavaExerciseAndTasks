import java.util.Arrays;

public class NewArray {
    static void moveIndex(int [] a,int index){

    }

    public static void main(String[] args) {
        int [] a = {2,3,4,5,6,7,8};
        for (int count = 0; count < a.length; count++){
            int fig = a[0];
            int temp = a[2];
            int number = a[4];
            a[0] = a[1];
            a[1] = fig;
            a[2] = a[3];
            a[3] = temp;
            a[4] = a[5];
            a[5] = number;
        }
        System.out.print(Arrays.toString(a));


    }
}
