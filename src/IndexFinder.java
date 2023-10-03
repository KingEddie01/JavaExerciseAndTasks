public class IndexFinder {
    static int findIndex(int [] a, int b) {
        for (int count = 0; count < a.length; count++) {
            if (b == a[count]) {
               return count;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        System.out.print("The index of 3 is " + findIndex(a,3));
    }
}
