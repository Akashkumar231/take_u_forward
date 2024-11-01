package IPA_TCS_JAVA;

import java.util.Scanner;

public class Question02 {

    // How many small letters in the string.

    public static void main(String [] args){

        System.out.println("Practice 15 marks question");

        Scanner input = new Scanner(System.in);

        String inputString = input.nextLine();

        int smallChar = 0;

        for(int i= 0 ; i < inputString.length() ; i++){

            if ('a'<= inputString.charAt(i) && inputString.charAt(i)<='z'){
                smallChar++;
            }

        }

        System.out.println(smallChar);

    }

}
