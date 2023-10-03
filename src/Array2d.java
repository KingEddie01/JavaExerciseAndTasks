import java.util.Arrays;

public class Array2d {

    public static void main(String[] args) {
        arrange();

    }
    public static void  arrange(){
      int [][] grades ={{1,2,3,4},
                        {5,6,7,8},
                        {7,9,0, 7}};
      for(int counter = 0; counter < grades.length; counter++){
          for (int num = 0; num < grades[counter].length; num++){
              System.out.print(grades[counter][num]+ "          ");
          }
          System.out.println();
      }
    }

}
