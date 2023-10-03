import java.util.Scanner;





import javax.swing.*;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class Period {



//        static  MenstrualCycle menstrualCycle = new MenstrualCycle();
        private static final Scanner input  = new Scanner(System.in);

        public static void main(String[] args) {
            welcomePage();
        }
        public static void welcomePage() {
            System.out.println
                    ("""    
                        Welcome to Cheddars Menstrual App \uD83C\uDF38!!!
                                        
                        your personalized menstrual companion!
                        We're here to make your monthly journey easier, more predictable, and a little bit magical. 
                        Say goodbye to guessing and hello to precision.
                        With Cheddars Menstrual App, you can effortlessly track your cycles, predict your next period, 
                        and stay ahead of your fertile days.\s
                        We've got your back throughout your entire cycle.
                        Are you Ready to take control of your body? Let's get started! \uD83C\uDF1F #PeriodPower\"""");

        }

        public static void mainMenu(){
            System.out.println("""
                            Main Menu
                            1. Check next period Start Date
                            2. Check period End Date
                            3. Check Safe Start Date
                            4. Check Ovulation Start Date
                            5. Check Ovulation End Date
                            6. Check Unsafe Start Date
                            7. Exit
                            """);

        }



    }








