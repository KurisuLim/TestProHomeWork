package WeekFour;

public class HomeworkRecursion {
    /*
    *   Algorithms Homework – Recursion
    *   Recursion
    *   Solve FizzBuzz and Palindrome exercise using recursion.
    * */
    public static void main(String[] args) {

        //Recursion Palindrome
        System.out.println("Recursion Palindrome:");
        System.out.println("Racecar" + " Is Palindrome ? " + isPalindrome("Racecar"));
        System.out.println("dad" + " Is Palindrome ? " + isPalindrome("dad"));
        System.out.println("Was It A Cat I Saw?" + " Is Palindrome ? " + isPalindrome("Was It A Cat I Saw?"));

        //Recursion Fizzbuzz
        System.out.println("\nRecursion Fizzbuzz:");
        fizzBuzz(100);
    }

    public static boolean isPalindrome(String word){

        if(word==null){
            return false;
        }

        if(word.length() <=1){
            return true;
        }

        String newWord = word.toLowerCase().replaceAll("[!.,?@#$%^&*-+^\\s]","");

        if(newWord.charAt(0) == newWord.charAt(newWord.length() -1 )){
            return isPalindrome(newWord.substring(1, newWord.length()-1));
        }

        return false;

    }

    public static void fizzBuzz(int endNum) {

        if (endNum != 0) {

            if (endNum % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (endNum % 3 == 0) {
                System.out.println("Fizz");
            } else if (endNum % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(endNum);
            }

            endNum--;
            fizzBuzz(endNum);
        }


    }

}




