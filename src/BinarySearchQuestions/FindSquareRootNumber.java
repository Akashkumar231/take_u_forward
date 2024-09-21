package BinarySearchQuestions;

public class FindSquareRootNumber {

    public static int findSquareRoot(int number){


        int low = 1;
        int high = number;
        int ans = -1;
        while (low<= high){

            int mid = low + (high - low)/2;
            int val = mid * mid;

            if(val<= number){

                low = mid +1 ;


            }else {

                high = mid - 1;

            }


        }

        return high;



    }

    public static void main(String []args){

        System.out.println(findSquareRoot(16));

    }

}
