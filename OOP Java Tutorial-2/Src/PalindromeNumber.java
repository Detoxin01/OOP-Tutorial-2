import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome(int x) {
        // negative numbers are not palindromes
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;       // extract last digit
            reversed = reversed * 10 + digit;  // build reversed number
            x = x / 10;               // remove last digit
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}