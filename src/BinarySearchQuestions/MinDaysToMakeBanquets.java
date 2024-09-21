package BinarySearchQuestions;

public class MinDaysToMakeBanquets {

    public static boolean isPossible(int [] array,int days ,int k , int m){

        int noOfBanquets = 0;

        int count = 0;

        for(int i = 0; i<array.length ; i++){

            if (array[i]<=days){

                count++;

            }else {

                noOfBanquets+=count/k;
                count=0;

            }


        }

        noOfBanquets+=count/k;

        if (noOfBanquets==m){
            return true;
        }

        return false;

    }

    public static  int minNumber(int [] array){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i< array.length ; i++){

            if (min>array[i]){

                min=array[i];

            }


        }
        return min;

    }

    public static int maxNumber(int [] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< array.length ; i++){

            if (max<array[i]){

                max=array[i];

            }


        }
        return  max;



    }

    public static int minDaysToMakeBanquets(int [] array , int k , int m){

        if (m*k>array.length){

            return -1;

        }

        int low = minNumber(array);
        int high = maxNumber(array);
        int ans = -1;
        while (low<=high){


            int mid = low +(high - low)/2;

            if (isPossible(array,mid,k,m)){
                ans=mid;
                high = mid -1;

            }else {

                low = mid+1;

            }



        }

       return ans;

    }


    public static void main(String [] args){

      int  N = 8;
      int arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2, k = 3;

      System.out.println(minDaysToMakeBanquets(arr,k,m));

    }

}
