import org.w3c.dom.ls.LSOutput;

public class Chapter5Asterisks {
    public static void main(String[] args) {
        int row;
        for (row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    }


