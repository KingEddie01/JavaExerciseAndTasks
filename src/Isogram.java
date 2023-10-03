import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Isogram {

    static Scanner input = new Scanner(System.in);

    static boolean check_isogram(String str) {
        str = str.toLowerCase();
        char[] newWord = str.toCharArray();
        System.out.println(Arrays.toString(newWord));
        System.out.println();
        Arrays.sort(newWord);
        for (int counter = 0; counter < newWord.length-1; counter++) {
            if (newWord[counter] == newWord[counter + 1])
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word = input.nextLine();
        System.out.println(check_isogram(word));

    }

    }
