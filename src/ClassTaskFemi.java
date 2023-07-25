import java.util.Arrays;
import java.util.Scanner;

public class ClassTaskFemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int maximum;
        int [] number = {5,6,7,0,0,0,0};
        int [] number1 = new int[7];
        int [] number2 = new int [7];

        for (int counter = 0; counter < number.length;counter++) {
            number[3] = number[0] + number[1] + number[2];
            number[4] = (number[0] + number[1] + number[2]) / 3;
            number[5] = number[0];
            if (number[1] < number[0]) {
                number[5] = number[1];
            } else if (number[2] < number[1]) {
                number[5] = number[2];
            }
            number[6] = number[0];
            if (number[1] > number[0]) {
                number[6] = number[1];
            } else if (number[2] > number[1]) {
                number[6] = number[3 ];
                System.out.println();
            }

            System.out.print(number[counter]);

        }

        }



    }


