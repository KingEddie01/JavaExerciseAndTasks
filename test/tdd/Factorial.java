package tdd;
import java.util.Scanner;
public class Factorial {
    private int number;



        public void convertFactorial ( int number){
            this.number = number;
            if (number < 0) {
                this.number = 0;
            }


        }


        public int getResultFactorial () {
            return number;

        }

        public void factorialIsEqualTo ( int number){
            this.number = number * (number - 1) * (number - 2) * (number - 3) * (number - 4);
            number = this.number;
        }

        public int getFactorialIsEqualTo () {
            return number;

        }

        public void zeroFactorialToOne ( double number){
            if (number == 0) {
                this.number = 1;
            }

        }

        public int getOneFromZero () {
            return this.number;

        }

        public void oneFactorialToOne ( int number){
            if (number == 1) {
                this.number = 1;
            }


        }

        public int getOneFactorialToOne () {
            return this.number;
        }


        public void theFactorialOf ( int number) {


            int factorial = 1;
            while (number < 31) {
                factorial = factorial * number;
                number--;}
            if (number > 30){
                this.number = 0;
            }


            }

        public int totalFactorial() {
            return this.number;

    }

        }


