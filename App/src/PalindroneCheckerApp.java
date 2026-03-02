/*/ MAIN CLASS - UseCase12PalindromeCheckerApp

* Use Case 12: Strategy Pattern for Palindrome Algorithms

* Description:
        * This class demonstrates how different palindrome
* validation algorithms can be selected dynamically
* at runtime using the Strategy Design Pattern.

* At this stage, the application:
        * - Defines a common PalindromeStrategy interface
* - Implements a concrete Stack based strategy
* - Injects the strategy at runtime
* - Executes the selected algorithm

* No performance comparison is done in this use case.
        * The focus is purely on algorithm interchange ability.

* The goal is to teach extensible algorithm design.

* author Developer
* version 12.0
 */
import java.util.Scanner;
import java.util.Stack;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeStrategy strategy = new StackStrategy();
        System.out.print("Input : ");
        String input = scanner.nextLine();
        boolean isPalindrome = strategy.check(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        String cleanedInput = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleanedInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}