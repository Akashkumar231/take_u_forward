import java.util.Arrays;

public class BubbleSort {

    public static void main(String [] args){

        int [] array = new int[]{9,8,7,6,5,4,3,2,1};

        for(int i = 0;i < array.length ; i++){

            boolean isSwapped = false;

            for (int j = 1 ; j< array.length ; j++){

                if(array[j] < array[j-1]){

                    SelectionSort.swap(array,j,j-1);
                    isSwapped=true;
                }


            }
            if (isSwapped== false){

                break;

            }

        }

        System.out.println(Arrays.toString(array));

    }

}
