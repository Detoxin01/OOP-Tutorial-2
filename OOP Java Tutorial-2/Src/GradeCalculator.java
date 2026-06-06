import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained (0 - 100): ");
        double marks = scanner.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        } else {

            String grade = marks >= 90 ? "A+" :
                    marks >= 85 ? "A"  :
                    marks >= 80 ? "A-" :
                    marks >= 75 ? "B+" :
                    marks >= 70 ? "B"  :
                    marks >= 65 ? "B-" :
                    marks >= 60 ? "C+" :
                    marks >= 55 ? "C"  :
                    marks >= 50 ? "C-" :
                    marks >= 45 ? "D+" :
                    marks >= 40 ? "D"  : "F";

            String remarks = marks >= 80 ? "Distinction" :
                    marks >= 65 ? "Credit"      :
                    marks >= 50 ? "Pass"        :
                    marks >= 40 ? "Conceded Pass" : "Fail";

            double gpa =    marks >= 90 ? 4.0 :
                    marks >= 85 ? 3.7 :
                    marks >= 80 ? 3.3 :
                    marks >= 75 ? 3.0 :
                    marks >= 70 ? 2.7 :
                    marks >= 65 ? 2.3 :
                    marks >= 60 ? 2.0 :
                    marks >= 55 ? 1.7 :
                    marks >= 50 ? 1.3 :
                    marks >= 45 ? 1.0 :
                    marks >= 40 ? 0.7 : 0.0;

            System.out.println("\n--- Result ---");
            System.out.println("Marks   : " + marks);
            System.out.println("Grade   : " + grade);
            System.out.println("GPA     : " + gpa);
            System.out.println("Remarks : " + remarks);
        }

        scanner.close();
    }
}