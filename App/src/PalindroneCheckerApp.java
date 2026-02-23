import java.util.Scanner;
import java.util.Stack;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        boolean isPalindrome = false;
        for(char c : input.toCharArray()){
            char poppedChar = stack.pop();
            if(poppedChar!=c){
                isPalindrome = true;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("is Palindrome? " + isPalindrome);
    }
}
