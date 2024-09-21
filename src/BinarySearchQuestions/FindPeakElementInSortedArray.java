package BinarySearchQuestions;

public class FindPeakElementInSortedArray {

    public static int findPeakElement(int [] array){

        if (array.length == 1){
            return array[0];
        }

        if (array[0] > array[1]){
            return 0;
        }
        if (array[array.length-1] > array[array.length-2]){
            return array.length-1;
        }

        int low = 1;
        int high = array.length-2;

        while (low<=high){

            int mid = low + ( high - low)/2;

            if (array[mid] > array[mid-1] && array[mid]> array[mid+1]){

                return mid;
            }
            else if (array[mid] >array[mid-1]){

                low = mid+1;

            }else {
                high = mid -1 ;
            }

        }

        return -1;
    }

    public static void main(String [] args){

        int [] array = new int[]{9,1,2,3,4,5,6,7,8};

        System.out.println(findPeakElement(array));


    }

}
