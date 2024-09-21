package Arrays;

public class MaximumSubArray {


    public static int getMaxSum1(int [] array ){

      int maxSum = Integer.MIN_VALUE;

        for(int i =0 ; i< array.length ;i++){

            int sum = 0;

            for(int j = i ; j<array.length ;j++){

                sum+=array[j];

                if(sum>maxSum){

                    maxSum= sum;

                }

            }



        }


        return maxSum;

    }


    public static int getMaxSum2(int [] array ){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i< array.length ;i++){

            sum+=array[i];

            if(sum>maxSum){

                maxSum = sum;

            }

            if (sum<0){
                sum = 0;
            }



        }

 return maxSum;

    }

     public static int [] getMaxSub(int [] array){

        int [] result = new int[] {-1,-1};
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int start= 0;
        int ansStart = 0;
        int ansEnd = 0;

        for(int i = 0; i< array.length ;i++){
            if(sum == 0){
                start = i;

            }

            sum+=array[i];



            if(sum>maxi){

                maxi = sum;
                ansEnd = i;
                ansStart= start;


            }

            if (sum<0){
                sum =0;
            }


        }

        result[0]=ansStart;
        result[1]= ansEnd;


        return result;
     }

     public static void main(String [] args){


        int [] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};

         System.out.println(java.util.Arrays.toString(getMaxSub(array)));




     }



}
