import java.util.Arrays;

public class SelectionSort {


    public static void swap(int [] array , int firstIndex , int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex]= array[secondIndex];
        array[secondIndex]= temp;


    }

    public static void main(String[] args){

        int [] array = new int[]{9,8,7,6,5,4,3,2,1};


        for (int i = 1 ; i<array.length; i++){

            int swapIndex = i-1;
            int minIndex = i - 1;
            for(int j =i-1 ; j<array.length;j++){

                if(array[j] < array[minIndex]){

                    minIndex = j;

                }


            }

            swap(array,swapIndex,minIndex);

        }

        System.out.println(Arrays.toString(array));


    }

}
