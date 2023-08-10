import java.util.Scanner;

public class StudentGradeSheet {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int position;

        System.out.println("How many student do you have? ");
        int numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer? ");
        int numberOfSubjects = input.nextInt();

        System.out.print("Saving >>>>>>>>>> " +
                "\nSaved successfully");

        {
            System.out.println();
            System.out.println();
        }

        int student1subject1 = 0, student1subject2 = 0, student1subject3 = 0,total1=0;
        double average1 = 0;
        for (int counter1 = 1; counter1 < 4; counter1++) {
            System.out.println("Entering score for student 1");
            System.out.println("Enter score for subject " + counter1);
            int student1Score = input.nextInt();

            System.out.println("Saving >>>>>>>>>> " +
                    "\nSaved successfully");
            if (counter1 == 1) {
                student1subject1 = student1Score;
            }
            if (counter1 == 2) {
                student1subject2 = student1Score;
            }
            if (counter1 == 3) {
                student1subject3 = student1Score;
            }
            System.out.println();
        }
            {
                System.out.println();
                System.out.println();
            }
        int student2subject1 =0, student2subject2 = 0,student2subject3 = 0,total2= 0;
        double average2 = 0;
        for (int counter2 = 1; counter2 < 4; counter2++) {
            System.out.println("Entering score for student 2");
            System.out.println("Enter score for subject " + counter2);
            int student2Score = input.nextInt();
            System.out.println("Saving >>>>>>>>>> " +
                        "\nSaved successfully");
            if (counter2 == 1) {
                student2subject1 = student2Score;
                }
            if (counter2 == 2) {
                student2subject2 = student2Score;
                }
            if (counter2 == 3) {
                    student2subject3 = student2Score;
                }
            System.out.println();
            }
        {
            System.out.println();
            System.out.println();
        }

        int student3subject1=0,student3subject2=0,student3subject3=0,total3 = 0;
        double average3 = 0;
        for (int counter3 = 1; counter3 < 4; counter3++) {
            System.out.println("Entering score for student 3");
            System.out.println("Enter score for subject " + counter3);
            int student3Score = input.nextInt();
            System.out.println("Saving >>>>>>>>>> " +
                        "\nSaved successfully");
            if (counter3 == 1) {
                student3subject1 = student3Score;
                }
            if (counter3 == 2) {
                student3subject2 = student3Score;
                }
            if (counter3 == 3) {
                student3subject3 = student3Score;
                }
            System.out.println();
            }
        {
            System.out.println();
            System.out.println();
        }

        int student4subject1 = 0, student4subject2 = 0, student4subject3 = 0, total4 = 0;
        double average4 = 0;
        for (int counter4 = 1; counter4 < 4; counter4++) {
            System.out.println("Entering score for student 4");
            System.out.println("Enter score for subject " + counter4);
            int student4Score = input.nextInt();
            System.out.println("Saving >>>>>>>>>> " +
                    "\nSaved successfully");
            if (counter4 == 1) {
                student4subject1 = student4Score;
                }
            if (counter4 == 2) {
                student4subject2 = student4Score;
                }
            if (counter4 == 3) {
                student4subject3 = student4Score;
                }
            System.out.println();
            }
        {
            System.out.println();
            System.out.println();
        }
        average1 = (double) (student1subject1 + student1subject2 + student1subject3) / numberOfSubjects;
        average2 = (double) (student2subject1 + student2subject2 + student2subject3) / numberOfSubjects;
        average3 = (double) (student3subject1 + student3subject2 + student3subject3) / numberOfSubjects;
        average4 = (double) (student4subject1 + student4subject2 + student4subject3) / numberOfSubjects;

        total1 = (student1subject1 + student1subject2 + student1subject3);
        total2 = (student2subject1 + student2subject2 + student3subject3);
        total3 = (student3subject1 + student3subject2 + student3subject3);
        total4 = (student4subject1 + student4subject2 + student4subject3);

        if (total1 > total2){
            position = 1;
        }





        System.out.println("===================================================="+
                "\nSTUDENT\t\t\tSUB1\tSUB3\tSUB3\tTOT\tAVE\tPOS" +
                "\n====================================================" +
                "\nSTUDENT 1"+"\t\t"+student1subject1+ "\t\t" +student1subject2+ "\t\t" +student1subject3 +"\t\t"+ total1 +"\t" + average1 +"\n"

        );


    }
}















