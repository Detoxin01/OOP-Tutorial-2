import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("\n--- Pyramid Pattern ---");

        for (int i = 1; i <= rows; i++) {

            // print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
