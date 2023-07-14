import java.util.Scanner;
public class Loop
{
    public static void main(String[] args) {
        calculation();

    }
        
        public static void calculation(){
            System.out.print("N\t\tN1\t\tN2\t\tN3\t\tN4");
            System.out.println();

           for ( int number = 1 ; number < 6 ; number++) {
               for (int value = 1; value < 6; value++) {
                   int power = (int) Math.pow(number, value);

                   System.out.print(power +"\t\t");
               }
               System.out.println();

           }

               
               
               
               
           }
            
            
            
        }



    
        
        
        
        
        
        
    