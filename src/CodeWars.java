public class CodeWars {

    public static void main(String[] args) {
        int total = 0, counter = 1;
        while (counter < 10){
            if (counter % 3 == 0 || counter % 5 == 0) {
                total += counter;
            }
            counter++;}
        System.out.print(total);
        }
    }








