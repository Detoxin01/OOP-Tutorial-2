import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Basic Calculator ---");
        System.out.print("Enter first number  : ");
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number : ");
        double b = scanner.nextDouble();

        double result;
        String operation;

        switch (op) {
            case '+':
                result = a + b;
                operation = a + " + " + b + " = " + result;
                break;
            case '-':
                result = a - b;
                operation = a + " - " + b + " = " + result;
                break;
            case '*':
                result = a * b;
                operation = a + " * " + b + " = " + result;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = a / b;
                operation = a + " / " + b + " = " + result;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }

        System.out.println("\nResult: " + operation);
        scanner.close();
    }
}