public class SpecificValue {
    static boolean check(int [] a, int num){
        for (int value : a){

            if (num == value ){
                return true;
            }
        }
        return false;
        }

    public static void main(String[] args) {
        int [] a = {10,30,40,3,4,5,6,7,8,9,10};
        System.out.println(check(a,200));
    }
    }


