import java.util.*;

public class StudentGraderApp {

    static Scanner input = new Scanner(System.in);


    static int studentNumber;

    static ArrayList<Integer> position = new ArrayList<>();

    static int subjectNum;
    static int numb;


    static int fig;


    static int score;
    static int counter;

    static int num;
    static double average;
    static int total;


    public static void main(String[] args) {
        Question1();

    }

    public static void Question1() {
        System.out.println("How many student do you have? ");
        String numberOfStudent = input.nextLine();
        if (numberOfStudent.matches("^\\d{1,9}")) {
            studentNumber = Integer.parseInt(numberOfStudent);

            Question2();
        } else {
            System.out.println("Invalid input");
            Question1();
        }
    }

    public static void Question2() {
        System.out.println("How many subject do student offer? : ");
        String subjectNumber = input.nextLine();
        if (subjectNumber.matches("^\\d{1,9}")) {
            subjectNum = Integer.parseInt(subjectNumber);
            System.out.println("Saving >>>>>>>>>>>>>>>" + "\n" + "Saved Successfully");
            System.out.println();
            Input();
        } else {
            System.out.println("Invalid input");
            Question2();
        }
        System.out.println();
    }

    public static void Input() {
        int[][] studentExam = new int[studentNumber][subjectNum];
        for (counter = 0; counter < studentExam.length; counter++) {
            System.out.println("Entering Score for Student " + " " + (counter + 1));
            for (num = 0; num < subjectNum; num++) {
                System.out.println("Enter Score for Subject" + " " + (num + 1));
                studentExam[counter][num] = input.nextInt();
                System.out.println();
                System.out.println("Saving >>>>>>>>>>>>>>>" + "\n" + "Saved Successfully");
            }
            System.out.println();
        }
        System.out.print("=".repeat(70));
        System.out.printf("%n%S", "STUDENT");
        for (int digit = 1; digit <= subjectNum; digit++) {
            System.out.printf("%11s", "SUB" + (digit));
        }
        System.out.printf("%9s%9s%9s", "TOT", "AVE", "POS");
        System.out.printf("%n%s", "=".repeat(70));

        for (int count = 0; count < studentExam.length; count++) {
            System.out.printf("%n%S", "STUDENT" + (count + 1));
            total = 0;
            average = 0.0;
            for (numb = 0; numb < subjectNum; numb++) {
                total += studentExam[count][numb];
                average = (double) total / subjectNum;
                System.out.printf("%10d", studentExam[count][numb]);
            }
            System.out.printf("%9d", total);
            System.out.printf("%9.2f", average);
            position.add(total);
        }
            position.sort(Collections.reverseOrder());
             fig = 0;
            int value = 0;

        for (int i = 0; i < position.size(); i++) {
            System.out.println();
            System.out.printf("%9d%n", i+1);
        }

//            while (fig < position.size()) {
//            if (position.get(fig) > position.get(fig + 1)) {
//                value = fig + 1;
//            }
//            fig++;
//            System.out.printf("%9d", value);
//            }

            }

        }





































