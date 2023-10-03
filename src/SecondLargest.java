import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
    static  int result;
    public int secondLargest(String valueAlphaNumeric) {
        int max = 0;
        int temp;
        ArrayList<String> alphaNumeric = new ArrayList<>();
        ArrayList<Integer> numeric = new ArrayList<>();

        for (int count = 0; count < valueAlphaNumeric.length(); count++) {
            alphaNumeric.add(String.valueOf(valueAlphaNumeric.charAt(count)));
            if (alphaNumeric.get(count).matches("\\d"))
                numeric.add(Integer.parseInt(alphaNumeric.get(count)));
        }
        System.out.println(alphaNumeric + " ");
        System.out.println(numeric);
        Collections.sort(numeric);
        System.out.println(numeric);
        for (int num = 1; num < numeric.size(); num++) {
            temp = numeric.get(0);
            if (temp == numeric.get(num)) {
                max = -1;
            } else {
                max = numeric.get(numeric.size() - 2);
            }
            result = max;
        }
        return max;
    }

    public static void main(String[] args) {
        SecondLargest secondLargest = new SecondLargest();
        System.out.println(secondLargest.secondLargest("ABC7654DF"));
        int value = secondLargest.getSecondLargestNumber();
        System.out.println(value);
    }
    public int getSecondLargestNumber() {
        return result;
    }
}



