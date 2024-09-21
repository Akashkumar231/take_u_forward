package Recursion;

import java.util.Arrays;

public class SwapArray {


    public static void reverseArray(int [] array , int firstIndex, int secondIndex){

        if( firstIndex > secondIndex){

            return;
        }
        reverseArray(array,firstIndex+1,secondIndex-1);

        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;


    }

    public static void main(String [] args){
        int [] array = new int[]{5,4,21,52,365,6};

reverseArray(array,0,array.length-1);

System.out.println(Arrays.toString(array));


    }


}
