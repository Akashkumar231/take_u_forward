package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {

    public static void printPermutation(List<List<Integer>> result , List<Integer> list , int [] nums, boolean [] used )
    {
        if(list.size() == nums.length && !result.contains(list)){

            result.add(new ArrayList<>(list));
            return;

        }

        for(int i  = 0 ; i< nums.length ;i++){

            if (used[i])
                continue;

            used[i]=true;
            list.add(nums[i]);

            printPermutation(result,list,nums,used);

           used[i]=false;
           list.removeLast();

        }








    }

    public static void main(String [] args){

        int [] array = new int[]{1,3,3};
        List<List<Integer>>  result = new ArrayList<>();
        boolean [] used = new boolean[array.length];

     printPermutation(result,new ArrayList<>(),array,used);

        System.out.println(result);



    }

}
