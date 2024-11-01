package IPA_TCS_JAVA;

//Find the largest word from a given Sentence


import java.util.Scanner;

public class Question010 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String arrayString = input.nextLine();

        String [] array  = arrayString.split(" ");

        int length = Integer.MIN_VALUE;

        String longestWord = "";

        for(int i = 0; i< array.length ; i++){

            String word = array[i];

            if (length<word.length()){

                longestWord = word;
                length = longestWord.length();
            }


        }

        System.out.print(longestWord);

    }

}
