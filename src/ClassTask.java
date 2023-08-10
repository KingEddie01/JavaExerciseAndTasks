import java.util.Arrays;

public class ClassTask {
    public static void main(String[] args) {
        int[] numbers = {5,18,32,3,4};
        int max = numbers[0];
        for (int counter = 1; counter <= numbers.length; counter++){
                if (max < numbers[counter]){
                    max = numbers[counter];
                    System.out.print(max+ " ");
                }
                numbers[counter] = 0;
        }
    }
}






