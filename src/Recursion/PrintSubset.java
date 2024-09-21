package Recursion;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class PrintSubset {

    List<List<Integer>> result = new ArrayList<>() ;


    public static void getPrintSubset( int [] array, int index , List<Integer> ans){

       if(index == array.length){

//           System.out.println(ans);
           return;

       }

       ans.add(array[index]);
       getPrintSubset(array,index+1,ans);

       ans.remove(ans.size()-1);
       getPrintSubset(array,index+1,ans);





    }

    public static void getPrintSubset(int [] array , int index ,  String output , int currentSum, int targetSum){

        if(index == array.length){

            if(currentSum == targetSum){
                System.out.println(output);

            }
                return;



        }

        if(currentSum>targetSum)
            return;

        int element = array[index];
        getPrintSubset(array,index+1,output+element+", ",currentSum+element,targetSum);

        getPrintSubset(array,index+1 , output,currentSum,targetSum);


    }

    public static List<ArrayList<Integer>> getSubsequences(int[] array, int index) {
        List<ArrayList<Integer>> result = new ArrayList<>();

        if (index == array.length) {
            ArrayList<Integer> list = new ArrayList<>();
            result.add(list);
            return result;
        }

        List<ArrayList<Integer>> subsequences = getSubsequences(array, index + 1);

        result.addAll(subsequences);

        for (ArrayList<Integer> subsequence : subsequences) {
            ArrayList<Integer> newSubsequence = new ArrayList<>(subsequence);
            newSubsequence.add(0, array[index]);
            result.add(newSubsequence);
        }

        return result;
    }



    public static void main(String [] args){

//        getPrintSubset(new int [] {5,6,8,9,10},0,"",0,15);

//        getPrintSubset(new int[]{1,2,3},0,new ArrayList<>());


        System.out.println(getSubsequences(new int [] {1,2,3},0));

    }

}
