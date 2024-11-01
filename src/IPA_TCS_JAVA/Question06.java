package IPA_TCS_JAVA;

import java.util.Scanner;

public class Question06 {

    public static void main(String [] args){

        Scanner input =new Scanner(System.in);
        String string = input.nextLine();

        char ch = ' ';

        int count  = 0;

        for(int i = 0 ; i< string.length() ; i++){

            if (string.charAt(i) == ch){

                count++;

            }


        }

        if (count>=3){
            System.out.print(count);
        }else {
            System.out.print("NA");
        }

    }

}
