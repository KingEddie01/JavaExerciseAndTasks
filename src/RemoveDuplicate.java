import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class RemoveDuplicate {

    public static void removeDuplicate(int [] value) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int count = 0; count < value.length; count++) {
            number.add(value[count]);
        }
        System.out.println(number);

        for (int count = 0; count < number.size(); count++) {
            for (int num = 1; num < number.size(); num++) {
                if (number.get(count) == value[num])
                    number.remove(count);}
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        int [] number = {2,2,1,4,4,5,5};
        removeDuplicate(number);

    }
}









            








