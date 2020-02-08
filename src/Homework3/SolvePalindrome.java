package Homework3;

import java.util.Arrays;

public class SolvePalindrome {
    public static void main(String[] args){
        isPalindrome("racecar");
        System.out.println("");
        isPalindrome("Christopher");
    }

    public static void isPalindrome(String word){
        String reverseWord = "";
        System.out.println("Current Word: " + word + "\n");

        for(int i = word.length() - 1; i >= 0; i--){
            reverseWord += word.charAt(i);
            System.out.println(reverseWord);
        }

        System.out.println("\nReversed word:" + reverseWord + "\n");

        if(word.equals(reverseWord)){
            System.out.println(word + " & " + reverseWord + " is Palindrome!" );
        }
        else{
            System.out.println("It's not Palindrome!");
        }
    }
}
