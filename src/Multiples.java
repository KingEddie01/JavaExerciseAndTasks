public class Multiples {

    public static void main (String[]args) {
        boolean result =  isMultiple(3,27);
        System.out.println(result);
    }

        public static boolean isMultiple( int a, int b) {
        if (b % a == 0){
            return true;
        }
        else {
            return false;
        }
    }

    }







