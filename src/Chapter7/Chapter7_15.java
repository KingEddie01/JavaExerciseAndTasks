package Chapter7;

public class Chapter7_15 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Enter value for Length, first initializer and increment ");
        }
        else {
            int valueForLength = Integer.parseInt(args[0]);
            int[] numbers = new int[valueForLength];
            int initializer = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < numbers.length; counter++) {
                numbers[counter] = initializer + increment * counter;
            }
            System.out.printf("%5s%5s", "INDEX", "VALUE");
            int minimum = 0;
            int maximum = 0;
            double average = 0.0;
            for (int num = 0; num < numbers.length; num++) {
                System.out.printf("%n%5d%5d", num, numbers[num]);
                int total = 0;
                minimum = numbers[0];
                if (numbers[num] < minimum) {
                    minimum = numbers[num];
                }
                System.out.println("The minimum value is" + minimum);
                maximum = numbers[0];
                if (numbers[num] > maximum) {
                    maximum = numbers[num];
                }
                System.out.println("The maximum value is" + maximum);
            }
            average =(double) (minimum + maximum) /2;
            System.out.println("Average of maximum value and minimum value is "+ average);
        }
        }

    }

