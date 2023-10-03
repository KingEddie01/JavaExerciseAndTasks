public class Array2 {
    public static void main(String[] args) {
        int [] digit = {45,52,11,33,48,25};
        for (int counter = 0; counter < digit.length-1; counter++){
            int temp = digit[counter];
            digit[counter] = digit[counter+1];
            digit[counter+1]= temp;
        }
        for (int num : digit){
            System.out.print(" " + num);

        }

    }

}
