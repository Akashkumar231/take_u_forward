package IPA_TCS_JAVA;
import java.util.Scanner;

// Print the index of the character in the string
// String entered by the user;
// character will be entered by the user.

public class Question01 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Solve the 15 marks question ");

        String string = input.nextLine();

        char ch = input.next().charAt(0);

        for(int i = 0 ; i< string.length() ; i++){

            if(string.charAt(i)==ch){

                System.out.println(i+1);

                break;

            }


        }



    }

}
