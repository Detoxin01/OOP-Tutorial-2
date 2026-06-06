import java.util.Scanner;

public class LogicalOperatorsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int a = scanner.nextInt();

        System.out.print("Enter second number : ");
        int b = scanner.nextInt();

        System.out.print("Enter third number  : ");
        int c = scanner.nextInt();

        if (c == a + b) {
            System.out.println("\nResult: YES! " + c + " = " + a + " + " + b);
            System.out.println("The third number IS the sum of the first two.");
        } else {
            System.out.println("\nResult: NO! " + c + " ≠ " + a + " + " + b);
            System.out.println("The third number is NOT the sum of the first two.");
            System.out.println("Expected sum: " + (a + b));
        }

        scanner.close();
    }
}
