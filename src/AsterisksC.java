public class AsterisksC {
    public static void main(String[] args) {
        for ( int row = 0; row < 10 ; row++){
            for(int column = 0; column < row ; column ++){
                System.out.print(" "+" ");
            }
            for (int column = 10; column > row; column--){
                System.out.print("*" + " ");
            }
            System.out.println();


        }

    }



}
