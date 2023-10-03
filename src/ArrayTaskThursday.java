import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTaskThursday {

    static ArrayList<Integer> new_numbers = new ArrayList<>();
    public static void main(String[] args) {
        Arrange();
    }
    public static void Arrange(){
        int [] numbers = {22,41,15,8,2,1};
        for (int number : numbers) {
            if (number % 2 != 0) {
                new_numbers.add(number - 2);}
        }
        System.out.println(new_numbers);
    }
}
