package IPA_TCS_JAVA;
// Enter a String and print all vowel as it is which is available on the string in the 0 index.

import java.util.Scanner;

public class Question07 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();


        String [] stringArray = word.split(" ");
        String ans = "aeiouAEIOU";

        for(int i = 0 ; i< stringArray.length ; i++){

            char ch = stringArray[i].charAt(0);

            if (ans.indexOf(ch)!=-1){

                System.out.print(ch);
            }


        }



    }

}
