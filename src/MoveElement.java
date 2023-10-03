import java.util.Arrays;

public class MoveElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,5,6,7,8,9};
        for (int count = 0; count < numbers.length - 1; count += 2) {
            int temp = numbers[count];
            numbers[count] = numbers[count + 1];
            numbers[count + 1] = temp;
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
