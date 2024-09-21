package BinarySearchQuestions;

public class FloorAndCeilValue {

    public static int floorValue(int [] array , int target){

        // arr[mid]<= target

        int low = 0;

        int high  = array.length -1;

        int ans = -1;

        while (low<= high){

            int mid = low + (high - low)/2;

            if(array[mid]<=target){

                ans = mid;
                low = mid+1;

            } else  {

                high = mid -1;

            }


        }

        return ans;

    }

    public static int cielValue(int [] array , int target){

        int low = 0;

        int high = array.length-1;

        int ans = -1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (array[mid]>=target){

                ans = mid;
                high = mid-1;

            }else {

                low=mid+1;

            }

        }

        return ans;


    }

    public static void main(String [] args){

        int [] array = new int[]{3,5,8,8,8,15,19};

        System.out.println(floorValue(array,15));
        System.out.println(cielValue(array,15));


    }

}
