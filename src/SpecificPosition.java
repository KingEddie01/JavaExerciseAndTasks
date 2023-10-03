import java.util.Arrays;

public class SpecificPosition {
    static void position(int [] a, int index, int new_element){
        int counter = 0;
        while (counter < a.length){
            if (counter == index){
                a[counter] = new_element;
                }
            counter++;
        }
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        int [] a = {2,3,4,5,6,7,8,9};
        position(a,2,300);
    }
}
