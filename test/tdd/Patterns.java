package tdd;

public class Patterns {
    public static void main(String[] args) {
        int line = 5;

        for (int rows = 1; rows <= 5 ; rows++){
            for (int columns = 1; columns <= rows; columns++){
                System.out.print("* " );
            }
            for(int columns = rows; columns <= 5;columns++ ){
                System.out.print("  ");
            }
            for (int columns = 1; columns <= rows; columns++){
                System.out.print("& ");
            }
            for (int columns = rows; columns <= 5; columns++){
                System.out.print("  ");
            }
            for (int columns = rows; columns <= 5; columns++){
                System.out.print("  ");
            }
            for( int columns = 1; columns <= rows; columns++){
                System.out.print("* " );
            }

            System.out.println();


        }
    }

}
