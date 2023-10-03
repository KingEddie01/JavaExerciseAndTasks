public class MaxAndMin {
    static void maxAndMin(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int counter = 1; counter < a.length; counter++) {
            if (a[counter] < 1){
                min = a[counter];
            }
            if (a[counter] > max) {
                max = a[counter];
            } else {
                a[counter] = min;
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,1,5,100,7,8,0};
        maxAndMin(a);
    }
}