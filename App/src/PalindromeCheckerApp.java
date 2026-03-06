import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}