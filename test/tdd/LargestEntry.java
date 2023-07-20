package tdd;


public class LargestEntry {
   public static int largestNumber(int... number){
       int largest  = number[0];
       for (int counter = 0; counter < number.length; counter++){
           if(number[counter] > largest){
               largest = number[counter];
           }
       }
       return largest;





   }

}
