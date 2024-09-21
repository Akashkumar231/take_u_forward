package BinarySearchQuestions;

public class KokoEatingBanana {

    public static int maxNumber(int [] array ){

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<array.length ; i++){

            if(array[i]> max){
                max = array[i];
            }


        }

        return max;


    }

    public static int totalHours(int [] array , int number){

        int total = 0;

        for(int i = 0 ; i < array.length ; i++){

            total+= Math.ceil((double)(array[i])/(double)(number));

        }

        return total;

    }

    public static int minimumBananas(int [] array,int hours ){

        int low = 1 ;
        int high=maxNumber(array);
        int ans = -1;
        while (low<=high){

            int mid = low + (high - low)/2;

            if (totalHours(array,mid)<=hours){
                ans=mid;
                high = mid - 1;

            }else {

                low = mid + 1;

            }

        }

        return ans;

    }

    public  static void main(String [] args){

        int [] array = new int[]{7, 15, 6, 3};
        System.out.println(minimumBananas(array,8));


    }


}
