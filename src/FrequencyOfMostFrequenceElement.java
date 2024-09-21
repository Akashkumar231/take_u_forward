import java.util.Arrays;

public class FrequencyOfMostFrequenceElement {


    public  boolean isPossible(int [] nums, int mid , int k){


        int windowSum = 0;
        int totalSum = 0;

        for(int i = 0 ; i< mid  ; i++){
            windowSum+=nums[i];
        }

        totalSum = nums[mid-1]* mid;

        if(totalSum - windowSum <=k){

            return true;
        }

        int j = 0;
        for(int  i = mid;  i<nums.length;i++){

            windowSum-=nums[j];;
            windowSum+=nums[i];
            totalSum = nums[i]* mid;
            if(totalSum - windowSum <=k){

                return true;
            }
            j++;
        }

        return false;

    }


    public  int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int ans = 0;

        int low = 1 ;

        int high = nums.length;

        while (low<=high){

            int mid =  low + (high - low)/2;

            if ( isPossible(nums,mid,k)){
                ans = mid;

                low = mid +1;

            }
           else {
               high = mid - 1;
            }





        }


        return ans;


    }

    public static void main(String [] args){

  int [] ans = new int[]{3,9,6};

//  System.out.println(maxFrequency(ans,2)
//  );



    }



}
