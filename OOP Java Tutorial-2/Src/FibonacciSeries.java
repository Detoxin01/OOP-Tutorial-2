import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("\nFibonacci Series:");

            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a);
                if (i < n) System.out.print(", ");

                int next = a + b;
                a = b;
                b = next;
            }

            System.out.println();
        }

        scanner.close();
    }
}
