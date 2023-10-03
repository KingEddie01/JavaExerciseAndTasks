package Chapter7;

public class Chapter7_16 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Enter value for Length, first initializer and increment ");
        }
        else {
            int numberLength = Integer.parseInt(args[0]);
            int[] digits = new int[numberLength];
            int initializer = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < digits.length; counter++) {
                digits[counter] = initializer + increment * counter;
            }
            for (int num : digits){
                System.out.println(num);
            }
        }

    }
}
