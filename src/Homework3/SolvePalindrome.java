package Homework3;

import java.util.Arrays;

public class SolvePalindrome {
    public static void main(String[] args){
        isPalindrome("race cars"); //not palindrome
        isPalindrome("race car ! @#$%^&*"); //palindrome
        isPalindrome("Race caR"); //palindrome
    }
    public static void isPalindrome(String word){
        String reverseWord = "";
        String sanitizeWord = word.replaceAll("[A-Z!.,?@#$%^&*-+^\\s]","");
        System.out.println("\nCurrent Word: " + sanitizeWord + "\n");
        for(int i = sanitizeWord.length() - 1; i >= 0; i--){
            reverseWord += sanitizeWord.charAt(i);
            System.out.println(reverseWord);
        }
        System.out.println("\nReversed word:" + reverseWord + "\n");
        if(sanitizeWord.equals(reverseWord)){
            System.out.println(sanitizeWord + " & " + reverseWord + " is Palindrome!" );
        }
        else{
            System.out.println("It's not Palindrome!");
        }
    }
}
