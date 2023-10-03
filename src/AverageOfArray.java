public class AverageOfArray {
    static int arrayAverage(int [] a){
        int total = 0;
        int average = 0;
         for (int counter = 0; counter < a.length; counter++){
             total += a[counter];
         }
         average = total/a.length;
         return average;
    }

    public static void main(String[] args) {
        int [] a = {10,10,10,10,10};
        System.out.println(arrayAverage(a));
    }

}
