package WeekFour;

import java.io.PrintStream;

public class HomeworkRecursion {
    /*
    *   Algorithms Homework – Recursion
    *   Recursion
    *   Solve FizzBuzz and Palindrome exercise using recursion.
    * */
    public static void main(String[] args){

        //Recursion Palindrome
        System.out.println("Recursion Palindrome:");
        System.out.println("Racecar" + " Is Palindrome ? " + isPalindrome("Racecar"));
        System.out.println("dad" + " Is Palindrome ? " + isPalindrome("dad"));
        System.out.println("Was It A Cat I Saw?" + " Is Palindrome ? " + isPalindrome("Was It A Cat I Saw?"));

        //Recursion Fizzbuzz
        System.out.println("\nRecursion Fizzbuzz:");
        fizzBuzz(1,15);
    }

    public static boolean isPalindrome(String word){

        if(word==null){
            return false;
        }

        if(word.length() <=1){
            return true;
        }

        String new_word = word.toLowerCase().replaceAll("[!.,?@#$%^&*-+^\\s]","");
        int new_word_length = new_word.length();
        String firstChar = new_word.substring(0,1);
        String endChar = new_word.substring(new_word.length()-1, new_word_length);

        if(!firstChar.equals(endChar)){
            return false;
        }else{
            return isPalindrome(new_word.substring(1, new_word.length()-1));
        }

    }

    public static void fizzBuzz(int start_num, int end_num){

        if(start_num % 15 == 0){
            System.out.println("Fizz Buzz");
        } else if(start_num % 3 == 0){
            System.out.println("Fizz");
        } else if(start_num % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(start_num);
        }
            start_num++;

        if(start_num <= end_num) {
            fizzBuzz(start_num,end_num);
        }

    }
}




