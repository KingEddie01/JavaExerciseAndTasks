public class HighestDifference{
    public int getHighestDifference(int[] numbers){
        int maximum = 0,total;
        for (int counter = 0; counter < numbers.length-1; counter++){
           total = numbers[counter]-numbers[counter+1];
           if (total > maximum)
               maximum = total;{
               }
       }
        return maximum;
    }

    public static void main(String[] args) {
        int [] numbers = {5,18,32,3,4};
        HighestDifference highestDifference = new HighestDifference();
        System.out.println(highestDifference.getHighestDifference(numbers));


    }

}



