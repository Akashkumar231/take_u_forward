package BinarySearchQuestions;

public class MinimumInSortedArray {

    public static int getMinimumInSortedArray(int [] array ){

        int min = Integer.MAX_VALUE;
        int index = -1;
        int low = 0;
        int high = array.length-1;

        while (low<=high){
            int mid = low + ( high - low)/2;

            if (array[low] <= array[high]){
                min = Math.min(min,array[low]);
            }

            if ( array[low] <= array[mid] ){
                index  = low;
                min = Math.min(array[low],min);
                low = mid+1;

            }else {
                index = mid;
                min= Math.min(array[mid],min);
                high = mid -1;

            }

        }

        return min;
    }

    public static void main(String [] args){

        int [] array = new int[]{7,0,1,2};

        System.out.println(getMinimumInSortedArray(array));


    }


}
