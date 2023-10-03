public class ArrayArrangement {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        for (int counter = 0; counter < a.length; counter++){
            if (a[counter] % 2 == 0){
                int n = a[counter];
                System.out.print(a[counter +1]);

                a[counter] = a[counter + 1];
                a[counter + 1] =n;
            }
        }
        for (int num : a)
            System.out.print(" "+ num);
            }
        }


