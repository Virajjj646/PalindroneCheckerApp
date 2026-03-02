/*MAIN CLASS - UseCase9RecursivePalindrome

* Use Case 9: Recursive Palindrome Checker

* Description:
        * This class validates a palindrome using recursion.

        * Characters are compared from the outer positions
* moving inward using recursive calls.

* The recursion stops when:
        * - All characters are matched, or
* - A mismatch is found.
        *
        * This use case demonstrates divide-and-conquer
* logic using method recursion.

        * @author Developer
* @version 9.0
        */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "Level";

        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }

}