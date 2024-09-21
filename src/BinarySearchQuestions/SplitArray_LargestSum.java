package BinarySearchQuestions;

import java.util.List;

/*
Split Array - Largest Sum

Problem Statement: Given an integer array ‘A’ of size ‘N’ and an integer K. Split the array ‘A’ into ‘K’ non-empty sub-arrays such that the largest sum of any sub-array is minimized. Your task is to return the minimized largest sum of the split.
A sub-array is a contiguous part of the array.

 */
public class SplitArray_LargestSum {



   public static int getSubArray(int [] array , int sum){

       int add = 0;
       int K = 1;

       for(int i  = 0 ;  i<array.length ; i++ ){

           if(array[i]+add<=sum){
               add+=array[i];
           }else {
               K++;
               add = array[i];
           }



       }
       return K;



   }

   public static int splitArrayWithSum(int [] array , int K){

       if(K>array.length){
           return -1;
       }
       if(K==1){
           return NormalUtilityMethod.getSum(array);
       }

       int low = NormalUtilityMethod.getMax(array);
       int high = NormalUtilityMethod.getSum(array);

       for(int i = low ; i<= high ; i++){

           int subArray = getSubArray(array,i);
           if(subArray == K){
               return i;
           }


       }
       return low;



   }

    public static void main(String [] args){
       int  a[] = {3,5,1};

       System.out.println(splitArrayWithSum(a,3));

    }


}
