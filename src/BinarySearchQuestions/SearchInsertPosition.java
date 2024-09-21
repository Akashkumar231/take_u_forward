package BinarySearchQuestions;

public class SearchInsertPosition {

    public static int insertPosition(int [] array , int target){

        int low = 0;
        int high = array.length -1;

        int ans = -1;

        while (low<=high){

            int mid = low + (high-low)/2;

            if(target>=array[mid]){
                ans = mid;
                low = mid +1;
            }else {

                high = mid -1;
            }



        }


        return  ans+1;
    }

    public static int insertPositionStriker(int [] array , int target){
        int low = 0;
        int high = array.length-1;
        int ans = -1;
        while (low<= high){

            int mid = low + (high - low)/2;

            if(array[mid]>target){
                ans = mid;
                high = mid - 1;
            }else {

                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String [] args){

        int [] array = new int[]{3,5,8,8,8,15,19};

        System.out.println(insertPosition(array,8));
        System.out.println(insertPositionStriker(array,8));

    }

}
