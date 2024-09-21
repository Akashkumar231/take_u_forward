package Arrays;
//
//Find the missing number in an array
//
//Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.


import java.util.ArrayList;

public class MissingNumber {

    public static boolean isPresent(int [] array, int number){

        for(int i =0; i<array.length ; i++){

            if (array[i] == number){

                return true;
            }

        }
        return false;

    }


    public static int getMissing1(int [] array , int n){

         int missing= Integer.MAX_VALUE;
        for(int i = 1 ; i<= n ; i++){

             if (!isPresent(array, i)){

                 return i;
             }



        }

return missing;


    }

    public static void main(String [] args){

int [] array  = new int[]{1,3};
System.out.println(getMissing1(array,3));


    }

}
