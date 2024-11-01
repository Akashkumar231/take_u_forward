package IPA_TCS_JAVA;

import java.util.Scanner;

public class Question09 {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int number  = input.nextInt();

        int sum = 0;



        while (number>0){

           int rem = number % 10 ;

           sum =sum + rem;

           number = number / 10 ;

        }


        if (sum%3 == 0){
            System.out.print("True");
        }else {
            System.out.print("False");
        }

    }

}
