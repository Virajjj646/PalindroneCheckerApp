import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if(fromQueue != fromStack){
                isPalindrome =  false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("is Palindrome? " + isPalindrome);
    }
}
