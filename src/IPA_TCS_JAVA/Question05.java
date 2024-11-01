package IPA_TCS_JAVA;

// write a program to print the last character of every word in a string

// ignore all the digits and whitespaces

import java.util.Scanner;

public class Question05 {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        String newString =input.nextLine();

        String ans [] = newString.split(" ");

        for (int i = 0 ; i< ans.length ; i++){

            String word =  ans [i];
            char ch = word.charAt(word.length()-1);
            if (Character.isDigit(ch)){
                continue;
            }
            System.out.print(ch);

        }


    }

}
