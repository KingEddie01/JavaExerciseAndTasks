public class MArrays {
    public static void main(String[] args) {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6,}};
        int[][] data2 = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};

        System.out.println("Values in array1 by row are");
        showTable(data1);
        System.out.printf("%nValues in array2 by row are%n");
        showTable(data2);

    }

    public static void showTable(int[][] a) {
        for (int counter = 0; counter < a.length; counter++) {
            for (int num = 0; num < a[counter].length; num++) {
                System.out.printf("%5d", a[counter][num]);
            }
            System.out.println();
            }
        }
    }