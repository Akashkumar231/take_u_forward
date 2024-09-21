package BinarySearchQuestions;

public class SearchInRotatedArray_2 {


    public static int searchInRotatedArray2(int [] array , int target){

        int low = 0;

        int high = array.length -1;

        while (low<=high){

            int mid  =  low + (high - low)/2;

            if (array[mid]== target){
                return mid;
            }

            if (array[low] == array[mid] && array[mid]==array[high]){
                low=low+1;
                high=high-1;
                continue;
            }

            if (array[low] <= array[mid]){

                if (array[low] <= target && target< array[mid]){

                    high = mid -1;

                }else {

                    low = mid + 1;

                }

            }
            else {

                if (array[mid] < target && target<= array[high]){

                    low = mid +1 ;

                }else {

                    high = mid -1;

                }

            }

        }

        return  -1;



    }

    public static void main(String [] args){

        int [] array = new int []{3,1,2,3,3,3,3};

        System.out.println(searchInRotatedArray2(array,1));


    }

}
