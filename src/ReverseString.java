public class ReverseString {
    public static void reverse(String word){
        String newWord = " ";
        for ( int counter = word.length()-1;counter >= 0; counter--){
            newWord = newWord + word.charAt(counter);
        }
        System.out.print(newWord);
    }

    public static void main(String[] args) {
        reverse("abrakadabra");
    }
}
