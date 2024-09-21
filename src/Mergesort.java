import java.util.ArrayList;
import java.util.Arrays;

public class Mergesort {


    public static void merge(int [] array , int low , int mid , int high){


        int left  = low;
        int right = mid+1;

        ArrayList<Integer> result = new ArrayList<>();

        while (left<=mid && right<=high){

            if(array[left]<=array[right]){

                result.add(array[left]);
                left++;
            }else {

                result.add(array[right]);
                right++;

            }

        }

        while (left<=mid){

            result.add(array[left]);
           left++;
        }

        while (right<=high){

            result.add(array[right]);
            right++;
        }

     for (int i = low ; i<=high ; i++ ){

         array[i] = result.get(i-low);


     }

    }

    public static void mergeSort(int [] array , int low , int high){


        if(low == high) {
            return;

        }
        int mid = low +(high -low)/2
;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);





    }


    public static void main(String [] args){

 int [] array  = new int[]{5,4,2,3,2,1};

 mergeSort(array,0, array.length-1);

 System.out.println(Arrays.toString(array));

    }



}
