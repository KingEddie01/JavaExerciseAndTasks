import java.util.ArrayList;
import java.util.List;

public class ArrangeByIndex {
    static StringBuilder newWord;

public StringBuilder arrange(String statement) {
    newWord = new StringBuilder();
    int[] number = {6, 2, 3, 4, 1, 0, 5};
    List<String> words = new ArrayList<>();
    for (int count = 0; count < statement.length(); count++) {
        words.add(String.valueOf(statement.charAt(count)));
    }
    System.out.print(words);
    System.out.println();
    for (int count = 0; count < statement.length(); count++) {
        newWord.append(words.get(number[count]));

    }
    return newWord;
}

public static void main(String[] args) {
    ArrangeByIndex arrangeByIndex = new ArrangeByIndex();
    String words = "kissdry";
    System.out.println(arrangeByIndex.arrange(words));
    StringBuilder values = arrangeByIndex.arrange(words);
    System.out.print(values);

}
    public StringBuilder getArrangeIndex() {
        return newWord;
    }




}