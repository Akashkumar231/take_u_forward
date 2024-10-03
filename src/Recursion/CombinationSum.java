package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {


    public static void getCombinations(int [] array , int index , int target , List<List<Integer>> result , List<Integer> dataStructure){

        if (index == array.length){

            if (target == 0){

                result.add(new ArrayList<>(dataStructure));

                return;

            }

            return;

        }


        int element = array[index];

        if (element<=target){

            dataStructure.add(element);
            getCombinations(array,index , target-element,result,dataStructure);
            dataStructure.removeLast();

        }

        getCombinations(array,index+1,target,result,dataStructure);



    }


    public static void  main(String [] args){

        int [] array = new int[]{1,2,3,5,6};

        List<List<Integer>> result = new ArrayList<>();

        getCombinations(array,0,6,result,new ArrayList<>());

        System.out.println(result);

    }

}
