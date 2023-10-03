package Chapter7;

public class Chapter7_14 {
    public static double average(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total / numbers.length;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(average(a, b));
    }
}
