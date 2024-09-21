package Recursion;

public class PrintPermutation {

    public static void printPermutation(String input, String output){

        if(input.length()==0){
            System.out.println(output);
            return;
        }

        for(int i = 0;i<input.length() ;i++){

            char ch = input.charAt(i);
            String newInput = input.substring(0,i)+input.substring(i+1);
            printPermutation(newInput,output+ch);

        }





    }

    public static void main(String [] args){

    printPermutation("abc","");


    }

}
