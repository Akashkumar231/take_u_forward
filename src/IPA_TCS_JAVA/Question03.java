package IPA_TCS_JAVA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// In the given input string removes the duplicates and print a new string which does not contain duplicate string

public class Question03 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

//        Set<Character> set = new HashSet<>();
        String string = input.next();
        String newString = "";

        for (int i = 0 ; i < string.length() ; i++){

            char ch = string.charAt(i);

            if (newString.indexOf(ch)==-1){
                newString+=ch;
            }

        }

        System.out.println(newString);


//
//
//        String inputString = input.nextLine();
//
//        String newString = "";
//
//        for (int i = 0  ; i< inputString.length() ; i++){
//            char ch = inputString.charAt(i);
//
//            if (set.add(ch)){
//                newString+=ch;
//            }
//
//        }
//
//        System.out.println(inputString);
//        System.out.println(newString);

    }
}
