import java.util.Scanner;

public class AIAgePredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        int currentYear = 2026;

        System.out.println("\n--- Age Predictions ---");
        System.out.println("After 10 years : " + (age + 10));
        System.out.println("After 25 years : " + (age + 25));
        System.out.println("After 50 years : " + (age + 50));
        System.out.println("\nYou will turn 100 in the year: " + (currentYear + (100 - age)));

        scanner.close();
    }
}