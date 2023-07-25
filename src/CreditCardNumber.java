import java.util.Arrays;
import java.util.Scanner;

public class CreditCardNumber {

    public static void main(String[] args) {
        creditCard();
    }


        public static void creditCard(){
            Scanner input = new Scanner(System.in);
            System.out.println("Hello kindly enter card details to verify : ");
            String cardDetail = input.nextLine();

            int total1 = 0, sum = 0, newSum = 0, doubleSum = 0, secondSum = 0, firstSum = 0, totalSum = 0;

            int[] cardDetails = new int[cardDetail.length()];

            if (cardDetail.length() >= 13 && cardDetail.length() <= 16 ){
                for (int num = 0; num < cardDetail.length(); num++)
                    cardDetails[num] = Integer.parseInt(String.valueOf(cardDetail.charAt(num)));

                for (int counter = cardDetails.length -1; counter >= 0; counter-=2) {
                    total1 = cardDetails[counter] * 2;
                    if (total1 > 9) {
                        sum = (total1 / 10) + (total1 % 10);
                        doubleSum += sum;
                    } else {
                        newSum += total1;
                    }
                    firstSum = doubleSum + newSum;
                }
                for (int digit = cardDetails.length - 1; digit > 0; digit -= 2) {
                    secondSum += cardDetails[digit];
                }
                totalSum = firstSum + secondSum;


                if (cardDetails[0] == 4 && totalSum % 10 == 0) {
                    System.out.print("*".repeat(20) + "\n" + "** CREDIT CARD TYPE : VISA CARD" + "\n" + "** CREDIT CARD NUMBER : " + cardDetail + "\n" +
                            "** CREDIT CARD DIGIT LENGTH : " + cardDetail.length() + "\n" + "CREDIT CARD VALIDITY : VALID");
                } else if (cardDetails[0] == 5 && totalSum % 10 == 0) {
                    System.out.print("*".repeat(20) + "\n" + "** CREDIT CARD TYPE : MASTER CARD" + "\n" + "** CREDIT CARD NUMBER : " + cardDetail + "\n" +
                            "** CREDIT CARD DIGIT LENGTH : " + cardDetail.length() + "\n" + "CREDIT CARD VALIDITY : VALID");
                } else if (cardDetails[0] == 3 && cardDetails[1] == 7 && totalSum % 10 == 0) {
                    System.out.print("*".repeat(20) + "\n" + "** CREDIT CARD TYPE : AMERICAN EXPRESS CARD" + "\n" + "** CREDIT CARD NUMBER : " + cardDetail + "\n" +
                            "** CREDIT CARD DIGIT LENGTH : " + cardDetail.length() + "\n" + "CREDIT CARD VALIDITY : VALID");
                } else if (cardDetails[0] == 6 && totalSum % 10 == 0) {
                    System.out.print("*".repeat(20) + "\n" + "** CREDIT CARD TYPE : DISCOVER CARD" + "\n" + "** CREDIT CARD NUMBER : " + cardDetail + "\n" +
                            "** CREDIT CARD DIGIT LENGTH : " + cardDetail.length() + "\n" + "CREDIT CARD VALIDITY : VALID");
                } else {
                    System.out.println(" CREDIT CARD IS INVALID");
                    creditCard();
                }


            } else {
                System.out.println("ENTER A VALID CREDIT CARD NUMBER");
                creditCard();
            }
        }
    }










