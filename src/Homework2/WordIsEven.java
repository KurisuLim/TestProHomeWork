package Homework2;

public class WordIsEven {
    public static void main(String[] args){
        /*
        * You need to create a program, which will accept a string and check if total
        * count on characters within the string is even it should return:
        * “String is even” If not it should return: “String is not even”
        */
        //First Solution
        System.out.println(isEven("Chris")); //odd
        System.out.println(isEven("Test Pros")); //even

        //Second Solution
        isEvenString("mobilman89"); // 10 count
    }

    // If and else solution
    public static String isEven(String word){

        try{
            word = word.replaceAll("\\s","");
            if(word.length() % 2 == 0 ){
                return "String is even";
            }
            else {
                return "String is not even";
            }
        }
        catch (Exception e){
            return "You must enter a string!";
        }
    }

    // loop solution
    public static void isEvenString(String word){
        word = word.replaceAll("\\s","");
        String[] arrayWord = word.split("");
        int count = 0;
        for(int i = 0 ; i < arrayWord.length; i++){
//            System.out.println(arrayWord[i]);
            count++;
        }

        System.out.println("Count: " + count);

        if(count %2 == 0){
            System.out.println("String is Even!");
        }
        else {
            System.out.println("String is not Even!");
        }
    }

}
