import java.util.ArrayList;
import java.util.List;

public class Alphanumeric {
    static  int result;
        public int sumAlphanumeric (String valueAlphaNumeric) {

            ArrayList<String> alphaNumeric = new ArrayList<>();

            List<Integer> numeric = new ArrayList<>();

            for (int count = 0; count < valueAlphaNumeric.length(); count++) {
                alphaNumeric.add(String.valueOf(valueAlphaNumeric.charAt(count)));
                if (alphaNumeric.get(count).matches("\\d+"))
                    numeric.add(Integer.parseInt(alphaNumeric.get(count)));
            }
            System.out.println(alphaNumeric + " ");
            System.out.println(numeric + " ");

            for (int num = 0; num < numeric.size(); num++){
                if (numeric.get(num) == '-'){
                   result -= numeric.get(num+1);
                 }
                 result += numeric.get(num);}
            return result;
        }

        public static void main(String[] args) {
            Alphanumeric alphanumeric = new Alphanumeric();
            System.out.println(alphanumeric.sumAlphanumeric("ABC7654-10DF"));
            int value = alphanumeric.getSumAlphanumeric();
            System.out.println(value);
        }
        public int getSumAlphanumeric() {
            return result;
        }
    }





