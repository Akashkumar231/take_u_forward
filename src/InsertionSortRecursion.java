import java.util.Arrays;

public class InsertionSortRecursion {


    public static void insertionSort(int [] array , int i ){


        if(i == array.length){

            return;
        }

        for(int j = i ; j>0; j--){

            if (array[j]< array[j-1]){
                SelectionSort.swap(array,j, j-1);

            }
        }

        insertionSort(array,i+1);


    }

public static void main(String [] args){

    int [] array = new int [] {7,9,7,0,9,4,9,6,5,2};

  insertionSort(array,1);

    System.out.println(Arrays.toString(array));



}

}



