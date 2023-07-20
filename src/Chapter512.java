public class Chapter512 {
    public static void main(String[] args) {
        int total = 0;

        for (int counter = 0; counter <= 30; counter++){
            if (counter % 3 == 0) {
                total += counter;
            }
        }
        System.out.printf("The total is %d", total);


    }

}
