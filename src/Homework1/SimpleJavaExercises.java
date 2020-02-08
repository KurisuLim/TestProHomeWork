package Homework1;

public class SimpleJavaExercises {
    public static void main(String[] args){
        /*
        *   Homework 1 – Simple Java Exercises
        *
        *   1. Upload your file with link to you Github repo with solutions for:
        *   2. Create a loop that will print numbers from 1 to 10, except number 7
        *   3. Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        *   4. Call index outside of the bound. Handle this exception printing “Outside of bound message.”
        * */
        int[] num = {1,2,3,4,5};
        skipNumber(7, 10); // # 2
        printArrayInt(num);
    }

    public static void skipNumber(int min, int max){
        for(int i = 1;  i <= max; i++){
            if(i != min){
                System.out.println("Counting: " + i);
                // or we can just use the keyword "Contiue"
                //if (i == 7){ continue;}
            }
        }
    }

    public static void printArrayInt(int[] arrNum){
        for(int i = 0; i < arrNum.length; i++){
            System.out.println(arrNum[i]);
        }
    }


}
