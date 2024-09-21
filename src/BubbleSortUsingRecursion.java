import java.util.Arrays;

public class BubbleSortUsingRecursion {


    public static void bubbleSort(int [] array , int length){

        if(length==0){


            return;


        }

        for (int j  = 1 ; j< length-1 ; j++){

            if (array[j] < array[j-1]){

                SelectionSort.swap(array,j,j-1);

            }


        }

        bubbleSort(array,length-1);




    }

    public static void main(String[] args){

   int [] array = new int [] {7,9,7,0,9,4,9,6,5,2};

   bubbleSort(array,array.length);

   System.out.println(Arrays.toString(array));

    }


}
