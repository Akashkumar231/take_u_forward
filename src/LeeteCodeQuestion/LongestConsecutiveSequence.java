package LeeteCodeQuestion;


/*

128. Longest Consecutive Sequence

    Link : https://leetcode.com/problems/longest-consecutive-sequence/description/

   Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

   You must write an algorithm that runs in O(n) time.

 */

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static boolean isPresent(int [] array , int number){

        boolean result = false;


        for(int i = 0 ; i< array.length ;i++){

            if(array[i] == number)
            {
                return true;
            }
        }
        return false
                ;

    }

    public  static int getMaxLenBruteForce(int [] nums){

        int length= 0;

        for(int i = 0 ; i< nums.length ;i++){

            int count = 1;
            int number = nums[i];

            while (isPresent(nums, number+1)){
                number+=1;
                count++;

            }

            length = Math.max(count,length);

        }


        return length;
    }

    public static int longestConsecutiveSequence(int [] nums){

        int length = 0;
        int count = 1;

        Arrays.sort(nums);

        for(int i = 0; i< nums.length-1 ;i++ ){

            if(nums[i]+1 == nums[i+1]){

                count++;
                length=Math.max(count,length);

            }else {


                count=1;

            }

        }



        return length;
    }

    public static int striverSolution(int [] nums){

        int length=0;
        int count = 0;
        int smaller = Integer.MAX_VALUE;


        Arrays.sort(nums);

        for(int i = 0 ; i<nums.length ; i++){


            if(nums[i]-1 == smaller)
            {
         count++;
         smaller=nums[i];

            }else {
               count=1;
               smaller=nums[i];
            }

            length=Math.max(count,length);
        }


        return length ;
    }

    public static void main(String []args){

        int [] nums = new int[]{100, 200, 1,3, 2, 4};

         System.out.println(striverSolution(nums));

    }

}
