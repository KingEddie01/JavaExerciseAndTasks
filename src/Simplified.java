import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Simplified {

    public static void main(String[] args) {
        String input = "{\"ABC7654-10DF\")}";
        String regex = "[!-@#$%^&*()_+=\\[\\]{};:'\",.<>/?0-9]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> resultList = new ArrayList<>();
        while (matcher.find()) {
            resultList.add(matcher.group());
            }
        System.out.println("Input: " + input);
        System.out.println("Symbols and numbers: " + resultList);
        }
    }


