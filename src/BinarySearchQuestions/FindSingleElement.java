package BinarySearchQuestions;

public class FindSingleElement {

    public static int findSingleElement(int [] array ){

        if (array.length==1){
            return 0;
        }

        int n = array.length-1;

        if (array[0]!=array[1]){
            return array[0];
        }

        if (array[n]!=array[n-1]){
            System.out.println("Hey");
            return array[n-1];
        }

        int low = 1;
        int high = n-2;

        while (low<=high){

            int mid = low + ( high - low)/2;

            if ( array[mid] !=array[mid-1]  && array[mid]!=array[mid+1]){

                return mid;

            }

            if (mid%2==1 && array[mid]==array[mid-1] || mid%2==0 && array[mid+1]==array[mid]){

                low = mid + 1;

            }else {

                high = mid - 1;

            }



        }

        return -1;

    }

    public static void main(String [] args){

        int [] array = new int[]{0,0,1,1,2,2,3,3,4,5,5,6,6};

        System.out.println(findSingleElement(array));

    }

}
