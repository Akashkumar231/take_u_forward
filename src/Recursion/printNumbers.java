package Recursion;

public class printNumbers {

    public static void printIncrease(int i , int n ){

        if(i == n){

            return;

        }

        System.out.println(i);
        printIncrease(i+1,n);


    }


    public static void main(String [] args){


      printIncrease(0,10);




    }



}
