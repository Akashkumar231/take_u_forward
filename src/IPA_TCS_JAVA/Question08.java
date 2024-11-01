package IPA_TCS_JAVA;

import java.util.Scanner;

public class Question08 {

    public static void main(String []args){

        Scanner input =new Scanner(System.in);
        String word = input.nextLine();

        for(int i = 0 ; i< word.length() ; i++){

            if (i%2!=0){

                System.out.print(word.charAt(i));

            }


        }


    }

}
