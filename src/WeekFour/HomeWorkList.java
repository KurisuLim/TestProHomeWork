package WeekFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkList {
    /*
    Lesson 10 – Homework – Lists
    Lists:
    1. Initiate an Arraylist. Using For loop add integers from 1 to 10
    2. Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist
    3. Remove all odd numbers;
    * */
    public static void main(String[] args){
        System.out.println("\n#1");
        initArrayList(10); // # 1
        System.out.println("\n#2\n");
        removeInt();// # 2
        System.out.println("\n#3\n");
        removeOddNum(10);//# 3
    }
    public static void initArrayList(int num){
        int number = num;

        List<Integer> arrayList = new ArrayList();

        for(int i = 1; i <= number; i++){
            System.out.println("\nAdding the number: "+ i + " to the array list.");
            arrayList.add(i);
        }
        System.out.println("\nPrinting the array list\n");
        for(int list : arrayList){
            System.out.println("output: " + list);
        }

    }

    public static void removeInt(){
        List<Integer> arrayNum = new ArrayList<>();
        arrayNum.addAll(Arrays.asList(1, 2, 3, 6, 7, 3, 2, 1));

        System.out.println("Current array list: " + arrayNum);
        arrayNum.removeAll(Arrays.asList(2));
        System.out.println("Removing the number: " + 2);
        System.out.println("Current array list: " + arrayNum);

    }
    public static void removeOddNum(int num){
        int number = num;

        List<Integer> arrayNum = new ArrayList<>();

        for(int i = 1; i <= number; i++){
            if( i %2 == 0){
                System.out.println("Number: " + i + " is even. Adding to the list!");
                arrayNum.add(i);
            }
            else{
                System.out.println("Number: " + i + " is odd. Skipping!");
            }
        }
        System.out.println("\nList of even numbers: " + arrayNum);
    }
}
