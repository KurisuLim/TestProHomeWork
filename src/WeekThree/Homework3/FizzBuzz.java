package WeekThree.Homework3;

public class FizzBuzz {
    /*
        Week 3 – Homework 3 – Interview Code exercise – FizzBuzz

       1. Write a program that prints the numbers from 1 to 100.
       2. But for multiples of three print “Fizz” instead of the number
       3. and for the multiples of five print “Buzz”. For numbers which
       4. are multiples of both three and five print “FizzBuzz”.
    */

    public static void main(String[] args){
        fizzBuzz(100);
    }

    public static void fizzBuzz(int num){

        for(int i = 1; i <= num; i++){
          if(i % 3 == 0 && i %5 == 0){
                System.out.println("Number: " + i + " is Fizz Buzz!");
            }
            else if(i %3 == 0 ){
                System.out.println("Number: " + i + " is Fizz!");
            }
            else if(i %15 == 0){
                System.out.println("Number: " + i + " is Buzz!");
            }
            else {
              System.out.println(i);
          }

        }
    }
}
