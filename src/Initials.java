import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> data = new ArrayList<>();
        System.out.println("Enter names");
        String name = input.nextLine();
        for (int count = 0; count < data.size(); count++){
            data.add(name.charAt(count));
        }
        System.out.println(Arrays.toString(new String[]{data + " "}));

        }
}

