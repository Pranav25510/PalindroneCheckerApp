import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        scanner.close();
    }
}