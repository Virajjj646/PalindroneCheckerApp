/**
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 18.0
 */

import java.util.Scanner;

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("is Palindrome? " + isPalindrome);

        scanner.close();
    }
}