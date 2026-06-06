import java.util.Scanner;

class AttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = scanner.nextInt();

        if (totalClasses <= 0) {
            System.out.println("Total classes must be greater than 0.");
        } else if (attendedClasses < 0 || attendedClasses > totalClasses) {
            System.out.println("Invalid attendance value.");
        } else {
            double percentage = ((double) attendedClasses / totalClasses) * 100;
            System.out.printf("Attendance: %.2f%%%n", percentage);

            if (percentage >= 75) {
                System.out.println("Status: Eligible for Exam ✓");
            } else {
                System.out.println("Status: Not Eligible ✗");
            }
        }

        scanner.close();
    }
}
