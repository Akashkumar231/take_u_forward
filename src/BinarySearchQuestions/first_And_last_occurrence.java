package BinarySearchQuestions;

import java.util.Arrays;

public class first_And_last_occurrence {
/*
    public static int firstOccurrence(int [] array , int target){

        int low = 0;
        int high  = array.length-1;
        int ans = -1;

        while (low<= high){

            int mid = low + ( high - low)/2;

            if (array[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else {

                low = mid + 1;

            }


        }


        return ans;


    }

    public static  int lastOccurrence(int [] array , int target){

        int low = 0;
        int high  = array.length-1;
        int ans = -1;

        while (low<= high){

            int mid = low + ( high - low)/2;

            if (array[mid] > target){
                ans = mid;
                high = mid -1;
            }
            else {

                low = mid + 1;

            }

        }

        return ans;

    }

 */

    public static int firstOccurrence(int [] array ,int target){

        int low = 0;
        int high = array.length-1;
        int first = -1;
        while (low<=high){

            int mid = low + (high-low/2);

            if (array[mid]==target){

                first = mid;
                high = mid-1;


            }else if (array[mid]>target){

                high = mid -1;

            }else {

                low = mid + 1;

            }


        }

        return first;

    }

    public static int lastOccurrence(int [] array , int target){

        int low = 0;
        int high = array.length-1;
        int last = -1;
        while (low<=high){

            int mid = low + (high-low/2);

            if (array[mid]==target){

                last = mid;
                low = mid +1;


            }else if (array[mid]>target){

                high = mid -1;

            }else {

                low = mid + 1;

            }

        }

        return last;

    }

    public static void main(String[] args){

        /*

        int lastOccurrence = lastOccurrence(array,8);

        if( lastOccurrence == array.length || array[lastOccurrence-1]!=8 ){

            System.out.println("The element is not present");
            return;
        }

        System.out.println("The number of Count of the element is " + (lastOccurrence-firstOccurrence(array,8)));
         */

        int [] ans = new int[]{-1,-1};
        int [] array = new int[]{3,5,8,8,8,15,19};
        int firstOccurrence = firstOccurrence(array,8);

        if (firstOccurrence==-1){
            ans[0]=-1;
            ans[1]=-1;

        }
        else{

            ans[0]=firstOccurrence(array,8);
            ans[1]=lastOccurrence(array,8);

        }

        int numberOfOccurrence = 0;

        System.out.println(Arrays.toString(ans));

        System.out.println("The number of occurrence : " + (ans[1] - ans[0]+1) );


//        System.out.println(firstOccurrence(array,8));
//        System.out.println(lastOccurrence(array,8));

    }

}
