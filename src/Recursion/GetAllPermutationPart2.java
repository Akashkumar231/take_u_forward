package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetAllPermutationPart2 {

    public static void getAllPermutationPart2(int index , int [] nums,List<List<Integer>> ans ){

        if (index==nums.length){

            List<Integer> res = new ArrayList<>();
            for(int i = 0; i< nums.length ; i++){

                res.add(nums[i]);

            }

            ans.add(new ArrayList<>(res));

            return;

        }

        for (int i = index  ; i<nums.length ; i++){

            swap(nums,index,i);
            getAllPermutationPart2(index+1,nums,ans);
            swap(nums,index,i);
        }


    }

    public static void swap(int [] nums  , int first , int second){

        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;


    }

    public static void main(String [] args){

        int [] array  = new int[]{1,2,3};

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean [] freq = new boolean[array.length];
        getAllPermutationPart2(0,array,res);
        System.out.println(res);

    }

}
