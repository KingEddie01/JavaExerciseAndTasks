public class ArrayTask {
    public static void main(String[] args) {
        char[][] number = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'O', 'X', 'X'} };


        for (int counter = 0; counter < number.length; counter++) {
            for (int num = 0; num < number[counter].length; num++) {

                System.out.print(number[counter][num] + "  ");


            }
            System.out.println();
        }


    }


    }

