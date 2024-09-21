package BinarySearchQuestions;

public class BinarySearchIntroduction {

    public static int linearSearch(int [] array , int target){

        for(int i = 0 ;  i < array.length ;i++){

            if(array[i]== target){
                return i;
            }

        }

        return -1;

    }

    public static int binarySearch(int [] array , int target){

        int low = 0;
        int high = array.length -1 ;

        while (low<=high){

            int   mid = low + (high - low)/2; // handle the overflow condition.

            if( target==array[mid]) {
                return mid;
            } else if (target<array[mid]) {
                   high = mid -1;

            }else {
                low  = mid +1;
            }
        }

        return -1;

    }

    public static int binarySearchRecursion(int [] array ,int low , int high , int target){

        if(low>high){
            return -1;
        }
        int mid = low + (high - low)/2;

        if (array[mid]== target){
            return mid;
        }

        if (target<array[mid]){
            return binarySearchRecursion(array,low, mid-1,target);
        }

        return binarySearchRecursion(array,mid+1,high,target);

    }

    public static void main(String[] args){

       int [] array = new int[]{3,4,6,7,9,12,16,17};

       System.out.println(binarySearch(array,12));

       System.out.println(binarySearchRecursion(array,0,array.length-1,15));

    }
}
