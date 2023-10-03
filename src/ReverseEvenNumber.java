public class ReverseEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // Populate the array with numbers from 1 to 20
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Reverse even numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = reverseNumber(numbers[i]);
            }
        }

        // Print the reversed array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
