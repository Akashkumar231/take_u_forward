import java.util.Arrays;

public class InsertionSort {

    public static void main(String [] args){

        int [] array = new int[]{65,25,6,5,6,26,5};

        for (int i = 1 ; i<array.length ; i++){

            for (int j = i ; j>0 ; j--){

                if (array[j]<array[j-1]){

                    SelectionSort.swap(array,j,j-1);

                }

            }

        }

        System.out.println(Arrays.toString(array));


    }

}
