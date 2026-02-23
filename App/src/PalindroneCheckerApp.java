import java.util.Scanner;
public class PalindroneCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = false;
        while(start<end){
            if(chars[start] == chars[end]){
                isPalindrome = true;
            }
            start++;
            end--;
        }
        System.out.println("Input: " + input);
        System.out.println("is Palindrome? " + isPalindrome);
    }
}
