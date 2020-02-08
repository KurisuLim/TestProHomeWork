package Homework2;

public class Loops {
    public static void main(String[] args){
        /*
        * Waiting for the question to show up
        * */
        fibonacci(20);
    }
    /*
    * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
    * */

    public static void fibonacci(int num){
        int first =0;
        int second = 1;
        int next = 1;

        for(int i = 2; i <= num; i++){
            next = second + first;
            first = second;
            second = next;
            System.out.print(next + ",");
        }
    }
}
