import java.util.Arrays;

public class QuickSortAlgorithm {

    public static int getPartition(int [] array , int low, int high){

        int i = low ;
        int j = high;
        int pivot = array[low];

        while (i<j){

            while (array[i] <= pivot && i<=high-1){


                 i++;
            }

            while (array[j] > pivot && j>=low+1){


                j--;
            }





            if (i<j){

                SelectionSort.swap(array,i,j);

            }
        }
        SelectionSort.swap(array,j,low);


        return j;


    }


    public static void QuickSort(int [] array , int low , int high){

        if(low<high){

            int partion = getPartition(array,low,high);

            QuickSort(array,low,partion-1);
            QuickSort(array,partion+1,high);



        }





    }


    public static void main(String [] args){

        int [] array = {7,0,3,3,3,8,0,3,0,8};

        QuickSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));

    }



}
