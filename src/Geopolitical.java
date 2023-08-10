import java.util.Scanner;

public class Geopolitical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter state : ");
            String State_Entered = input.nextLine();
            System.out.println("Your zone is " + GeopoliticalZone.getZone(State_Entered));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        }
        }



