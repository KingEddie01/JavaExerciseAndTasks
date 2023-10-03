import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIST2D {
    public static void main(String[] args) {
        List<List<Integer>> scores = new ArrayList<List<Integer>>();
        scores.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        scores.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        scores.add(Arrays.asList(1, 2, 3, 4, 5, 6));


        for (List<Integer> score : scores) {
            System.out.print(score);
            for (int num : score) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
