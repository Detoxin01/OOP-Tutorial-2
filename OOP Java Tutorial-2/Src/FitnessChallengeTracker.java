import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] steps = new int[7];

        System.out.println("--- Fitness Challenge Tracker ---");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps for Day " + (i + 1) + ": ");
            steps[i] = scanner.nextInt();
        }

        int total = 0;
        int highest = steps[0];

        for (int i = 0; i < 7; i++) {
            total += steps[i];
            if (steps[i] > highest) {
                highest = steps[i];
            }
        }

        double average = (double) total / 7;

        System.out.println("\n--- Your Results ---");
        System.out.println("Total Steps   : " + total);
        System.out.printf("Average Steps : %.2f%n", average);
        System.out.println("Highest Steps : " + highest);

        scanner.close();
    }
}