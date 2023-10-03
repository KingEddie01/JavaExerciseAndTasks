import java.util.Arrays;

public class CombineReversedArray {
    static String [] result;
    public void combineArray(int[] array, int [] array2) {
        int[] newNumbers = new int[array.length + array2.length];
        int counter = 0;

        for (int count = array.length - 1; count >= 0; count--) {
            newNumbers[counter] = array[count];
            counter++;
        }
        for (int digit = array2.length - 1; digit >= 0; digit--) {
            newNumbers[counter] = array2[digit];
            counter++;
            result = new String[]{Arrays.toString(newNumbers)};
        }
    }
    public static void main(String[] args) {
        int [] number = {1, 2, 3, 4, 5, 6};
        int []  value = {7,8, 9, 10};
        CombineReversedArray combined = new CombineReversedArray();
        combined.combineArray(number, value);
        System.out.println(Arrays.toString(combined.getResult()));

    }
    public String[] getResult() {
        return result;

    }
}

