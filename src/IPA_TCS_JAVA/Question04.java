package IPA_TCS_JAVA;

// write a program to compute the number of spaces and characters in string.

import java.util.Scanner;

public class Question04 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String newString = input.nextLine();

        int characters = 0;
        int spaces = 0;

        for(int i = 0 ; i < newString.length() ; i++){

            char ch = newString.charAt(i);

            if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println(newString.length() - spaces);
    }

}
