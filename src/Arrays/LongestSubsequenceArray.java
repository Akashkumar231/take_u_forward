package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubsequenceArray {

    public static long getMaxLen1(int [] array , int k ){

        int maxlen  =-1 ;


        for(int i = 0 ; i<array.length ; i++){

            int sum = 0 ;


            for(int j= i ; j<array.length ; j++){

            sum +=array[j];


            if( sum == k){

            maxlen = Math.max(maxlen,j-i+1);

            }



            }

        }


        return maxlen;
    }

    public static int getMaxLen2(int [] array , int k){


        int maxlen = 0 ;
        long sum = 0;

        Map<Long, Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i< array.length ; i++){

            sum+=array[i];

            if(sum == k){

                maxlen = Math.max(maxlen,i+1);

            }

            long rem = sum - k;

            if (hashMap.containsKey(rem)){
                int len =  i - hashMap.get(rem);
                maxlen = Math.max(maxlen,len);
            }

            if (!hashMap.containsKey(sum)){

                hashMap.put(sum,i);

            }


        }


        return maxlen;
    }


     public static int getMaxLen3(int [] array , int target){

        int maxLen = 0;
        int sum = array[0];

        int forwardPointer = 0;
        int backwardPointer = 0;

        while (forwardPointer<array.length){

            while(backwardPointer<=forwardPointer && sum>target){

                sum-=array[backwardPointer];
                backwardPointer++;

            }

            if(sum==target){

                maxLen = Math.max(maxLen,forwardPointer-backwardPointer+1);

            }
            forwardPointer++;

            if (forwardPointer < array.length){

                sum+=array[forwardPointer];

            }

                   }







        return maxLen;
     }




     public static void main(String [] args){


         int [] array = {2,3,5};
         System.out.println(getMaxLen3(array,5));



     }


}
