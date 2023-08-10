import java.util.Scanner;

public class StudentGrade {
    private static final Scanner input = new Scanner(System.in);
    public  static int numberOfStudent;
    public static int numberOfSubjects;



    public static void question1(){
        System.out.println("How many student do you have? ");
        numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer? ");
        numberOfSubjects = input.nextInt();

        System.out.print("Saving >>>>>>>>>> " +
                "\nSaved successfully");
        System.out.println();
        System.out.println();
    }

    public static void Student1() {
        int student1subject1;
        int student1subject2;
        int student1subject3;
        for (int counter = 1; counter < 4; counter++) {
            System.out.println("Entering score for student 1");
            System.out.println("Enter score for subject " + counter);
            int student1Score= input.nextInt();
            System.out.print("Saving >>>>>>>>>> " +
                    "\nSaved successfully");
            if (counter == 1){
                student1subject1 = student1Score;
            }
            if (counter == 2) {
                student1subject2 = student1Score;
            }
            if (counter == 3) {
                student1subject3 = student1Score;
            }

            System.out.println();
            System.out.println();
        }
    }
    public static void Student2(){
        int student2subject1;
        int student2subject2;
        int student2subject3;
        for (int counter = 1; counter < 4; counter++) {
            System.out.println("Entering score for student 2");
            System.out.println("Enter score for subject " + counter);
            int student2Score = input.nextInt();
            System.out.print("Saving >>>>>>>>>> " +
                    "\nSaved successfully");
            if (counter == 1){
                student2subject1 = student2Score;
            }
            if (counter == 2) {
                student2subject2 = student2Score;
            }
            if(counter == 3){
                student2subject3 = student2Score;
            }
            System.out.println();
            System.out.println();
        }

    }
    public static void Student3(){
        int student3subject1;
        int student3subject2;
        int student3subject3;
        for (int counter = 1; counter < 4; counter++) {
            System.out.println("Entering score for student 3");
            System.out.println("Enter score for subject " + counter);
            int student3Score = input.nextInt();
            System.out.print("Saving >>>>>>>>>> " +
                    "\nSaved successfully");
            if (counter == 1){
                student3subject1 = student3Score;
            }
            if (counter == 2) {
                student3subject2 = student3Score;
            }
            if(counter == 3){
                student3subject3 = student3Score;
            }

            System.out.println();
            System.out.println();
        }
    }

    public static void Student4() {
        int student4subject1;
        int student4subject2;
        int student4subject3;
        for (int counter = 1; counter < 4; counter++) {
            System.out.println("Entering score for student 4");
            System.out.println("Enter score for subject " + counter);
            int student4Score= input.nextInt();
            System.out.print("Saving >>>>>>>>>> " +
                    "\nSaved successfully");
            if (counter == 1){
                student4subject1 = student4Score;
            }
            if (counter == 2) {
                student4subject2 = student4Score;
            }
            if (counter == 3) {
                student4subject3 = student4Score;
            }

            System.out.println();
            System.out.println();
        }
    }
    public static void display() {
        }







    public static void main(String[] args) {
        question1();
        Student1();
        Student2();
        Student3();
        Student4();




    }


}
