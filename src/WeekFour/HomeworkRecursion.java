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

        String newWord = word.toLowerCase().replaceAll("[!.,?@#$%^&*-+^\\s]","");
        int newWordLength = newWord.length();
        String firstChar = newWord.substring(0,1);
        String endChar = newWord.substring(newWord.length()-1, newWordLength);

        if(!firstChar.equals(endChar)){
            return false;
        }else{
            return isPalindrome(newWord.substring(1, newWord.length()-1));
        }

    }

    public static void fizzBuzz(int startNum, int endNum){

        if(startNum % 15 == 0){
            System.out.println("Fizz Buzz");
        } else if(startNum % 3 == 0){
            System.out.println("Fizz");
        } else if(startNum % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(startNum);
        }
        startNum++;

        if(startNum <= endNum) {
            fizzBuzz(startNum,endNum);
        }

    }
}




