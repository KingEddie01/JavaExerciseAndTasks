public class ArrayTask2 {
    public static void main(String[] args) {
            char[][] number = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'O', 'X', 'X'} };

        for (int counter = 0; counter < 3; counter++) {
            for (int num = 0; num < 3; num++) {
                if (number[counter][num] == 'X') {
                    System.out.print(1 + "  ");
                }
                if (number[counter][num] == 'O'){
                    System.out.print(0 + "  ");
                }

                }
            System.out.println();
            }


        }



        }








