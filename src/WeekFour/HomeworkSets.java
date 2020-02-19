package WeekFour;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeworkSets {
    public static void main(String[] args){
        /*
        *
        * Sets:
          Lesson 11 – Homework – Sets
          Initiate a Set. Using For loop add integers from 1 to 10
          Remove all odd numbers from sets.
          Try to create a set with duplicate values
        * */
        System.out.println("\n#1");
        loopSet(10);
        System.out.println("\n#2");
        removeOddSet(15);
        System.out.println("\n#3");
        duplicateValues();

    }

    public static void loopSet(int num){
        int number = num;

        Set<Integer> loop_num = new HashSet<>();

        for(int i = 1; i <= number; i++ ){
            loop_num.add(i);
        }

        for (int set : loop_num){
            System.out.println("Counting: " + set);
        }
    }

    public static void removeOddSet(int num){
        Set<Integer> even_num = new HashSet<>();

        for(int i = 1; i <= num; i++){
            if( i % 2== 0){
                System.out.println("Number: " + i + " is even. Adding to the list");
                even_num.add(i);
            }
            else {
                System.out.println("Number: " + i + " is odd!");
            }
        }
        System.out.println("\nSet of Numbers: " + even_num);
    }

    public static void duplicateValues(){
        System.out.println("\nSets cannot have a duplicate value!\n");
        Set<Integer> num1 = new HashSet<>();
        num1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));
        Set<Integer> num2 = new HashSet<>();
        num2.addAll(Arrays.asList(new Integer[] {3,5,6,9,11,12,13,14,15}));

        Set<Integer> combine = new HashSet<>(num1);
        combine.addAll(num2);

        System.out.println("First set: " + num1);
        System.out.println("Second set: " + num2);
        System.out.println("Combine set: " + combine);

        Set<Integer> duplicates = new HashSet<>(num1);
        duplicates.retainAll(num2);
        System.out.println("\nDuplicates in the sets: " + duplicates);

        Set<Integer> difference = new HashSet<>(num1);
        difference.removeAll(num2);
        System.out.println("\nDifference in the sets: " + difference);
    }
}
