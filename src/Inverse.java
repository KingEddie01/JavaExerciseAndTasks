public class Inverse {
    static int[] inverse(int[] a) {
        int[] b = new int[a.length];
        for (int counter = 0; counter < a.length; counter++) {
            int v = a[counter];
            b[v] = counter;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {2, 0, 3, 1, 4, 5};
        for (int counter = 0; counter < a.length; counter++) {
            System.out.print(a[counter] + " ");
        }
        System.out.println();
        int[] b = inverse(a);
        for (int num = 0; num < b.length - 1; num++) {
            System.out.print(b[num] + " ");
        }
        System.out.println();
    }

}
