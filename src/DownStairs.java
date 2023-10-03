import java.util.Scanner;

public class DownStairs {
    public static void main(String[] args) {
        identity();
    }
    public static void identity(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = input.nextLine();
        if (name.matches("^[a-zA-Z]+$")){

            System.out.print("Hello" + " " + name);
        }
        else{
            System.out.println("Kindly enter a valid input");
            identity();
        }
    }
}
