package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {

    public static void getPermutation(List<List<Integer>> result , List<Integer> tempList , int [] nums, int ind){

       if (ind == nums.length  ){
           System.out.println(tempList);

           result.add(new ArrayList<>(tempList));
           return ;

       }

          for (int index = 0 ; index < nums.length; index++){

            if (tempList.contains(nums[index]))
                continue;

              int element = nums[index];
              tempList.add(element);
              getPermutation(result,tempList,nums,ind+1);
              tempList.removeLast();

          }


//       for(int elements : nums){
//
//           if (tempList.contains(elements))
//               continue;
//
//           tempList.add(elements); // added the first element
//
//           getPermutation(result,tempList,nums); // gone for the second element
//
//           tempList.removeLast();
//
//
//
//
//
//
//       }


    }

    public static void main(String [] args){

     int [] array = new int[]{1,3};
     List<List<Integer>>  result = new ArrayList<>();

     getPermutation(result,new ArrayList<>(),array,0);

     System.out.println(result);

    }

}
