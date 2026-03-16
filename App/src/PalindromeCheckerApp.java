import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        checkPalindromeUsingQueueStack(word);

        sc.close();
    }

    // UC6 - Queue + Stack Based Palindrome Checker
    public static void checkPalindromeUsingQueueStack(String word) {

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into stack and queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        for (int i = 0; i < word.length(); i++) {

            char stackChar = stack.pop();   // reverse order
            char queueChar = queue.remove(); // normal order

            if (stackChar != queueChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}