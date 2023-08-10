import java.util.Scanner;

public class VideoTask {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Month_Check();
    }

    public static void Month_Check() {
        System.out.println("Enter the number of  month : ");
        String number = input.nextLine();
        String result = " ";
    result = switch (number){
        case "1" -> "january";
        case "2" -> "february";
        case "3" -> "march";
        case "4" -> "April";
        case "5" -> "may";
        case "6" -> "june";
        case "7" -> "july";
        case "8" -> "August";
        case "9" -> "september";
        case "10" -> "october";
        case "11" -> "november";
        case "12" -> "december";
        default -> "Not valid number";
        };
        System.out.println(result);

    }
}