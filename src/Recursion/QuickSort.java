package Recursion;

import java.util.Arrays;

public class QuickSort {


    public static void swap(int [] array ,int firstIndex , int secondIndex){


        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static int pivotIndex(int [] array ,int left , int right){

        int i  = left;
        int j = right;
        int pivot = array[left];


        while (i<j){

            while (array[i]<= pivot && i<=right){

                i++;

            }

            while (array[j]> pivot && j>=left){

                j--;

            }

            if (i<j){
                swap(array,i,j);

            }



        }
        swap(array,left,j);


        return j;
    }

    public static void quickSort(int [] array ,int low , int high){

        if (low  < high){
            int pivot = pivotIndex(array,low,high);
            quickSort(array,low,pivot);
            quickSort(array,pivot+1,high);
        }



    }


    public static void main(String [] args){

        int [] array = new int[]{5,9,6,8,3};

        System.out.println(Arrays.toString(array));

        System.out.println("Before Sorting");

        quickSort(array,0,array.length-1);

        System.out.println("After Sorting");

        System.out.println(Arrays.toString(array));

    }

}
