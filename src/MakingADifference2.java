import java.util.Scanner;

public class MakingADifference2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstDigit = 0, secondDigit = 0, thirdDigit = 0, fourthDigit = 0;
        int newDigit1=0, newDigit2= 0, newDigit3 = 0, newDigit4=0;

        System.out.print("Enter a digit : ");
        int digit = input.nextInt();
        for (int counter = 0; counter < 1; counter ++){
            firstDigit = digit/ 1000;
            secondDigit = digit/100 % 10;
            thirdDigit = digit/10 % 10;
            fourthDigit =digit % 10;

            if (firstDigit >= 7 ){
                newDigit1 = firstDigit -7;
            }
            else {
                newDigit1 = (firstDigit - 7) + 10;
            }
            if(secondDigit >= 7){
                newDigit2 = secondDigit-7;
            }
            else{
                newDigit2 = (secondDigit - 7) + 10;
            }
            if (thirdDigit >= 7){
                newDigit3 = thirdDigit-7;
            }
            else{
                newDigit3 = (thirdDigit - 7) + 10;
            }
            if (fourthDigit >= 7){
                newDigit4 = fourthDigit - 7;
            }
            else {
                newDigit4 = (fourthDigit - 7) + 10;
            }
        }
        System.out.printf("Encrypted integer is : %d%d%d%d",newDigit3,newDigit4,newDigit1,newDigit2);

        }



    }



