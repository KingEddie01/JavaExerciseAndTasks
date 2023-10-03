import java.util.Arrays;

public class ZeroEnd {
    public static void main(String[] args) {
        int [] a = {2,0,4,0,5,0};
        int counter = 0;
        for (int num = 0; num < a.length; num++){
            if (a[num] != 0){
                a[counter++] = a[num];
            }
            System.out.println(Arrays.toString(a));
        }

    }
}
