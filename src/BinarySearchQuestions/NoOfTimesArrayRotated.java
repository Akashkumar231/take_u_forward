package BinarySearchQuestions;

public class NoOfTimesArrayRotated {

    public static int getNumberOfTimesArrayRotated(int [] array ){

        int low = 0 ;
        int high = array.length-1;
        int index = -1;
        int min = Integer.MAX_VALUE;

        while (low<=high){

           int mid = low + (high - low)/2;

           if (array[low] <= array[high]){
               if (min>array[low]){
                   index = low;
                   min = array[low];
               }
               break;
           }

           if(array[low]<=array[mid]){

               if (min>array[low]){
                   index = low;
                   min = array[low];
               }

               low  = mid + 1;

           } else {

               if (min>array[mid]){
                   index = mid;
                   min = array[mid];
               }
               high = mid - 1;

           }


        }

        return index;



    }

    public static void main(String [] args){

        int [] array = new int[]{7,8,9,0,1,2};

        System.out.println(getNumberOfTimesArrayRotated(array));


    }

}
