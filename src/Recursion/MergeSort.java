package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void merge(int [] array , int low , int mid , int high){

       int left = low;
       int right = mid+1;
       List<Integer> arrayList = new ArrayList<>();

       while (left<=mid && right<=high){

           if (array[left]<=array[right]){
               arrayList.add(array[left]);
               left++;
           }else {
               arrayList.add(array[right]);
               right++;
           }

       }

       while (left<=mid){
           arrayList.add(array[left]);
           left++;
       }

       while (right<=high){
           arrayList.add(array[right]);
           right++;
       }


       for (int i = low ; i<=high ; i++){

           array[i]= arrayList.get(i-low);

       }


    }

    public static void mergeSort(int [] array , int low , int high ){

        if (low>=high){
            return;
        }

        int mid = (low + high)/2;

        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);


        merge(array,low, mid , high);

    }


    public static void main(String [] args){

        int [] array = new int[]{5,9,6,8,3};

        System.out.println(Arrays.toString(array));

        System.out.println("Before Sorting");

        mergeSort(array,0,array.length-1);

        System.out.println("After Sorting");

        System.out.println(Arrays.toString(array));



    }

}
