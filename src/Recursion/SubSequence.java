package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void printSubsequences(int [] array , int index, List<Integer> result){

        if(index> array.length){

            System.out.println(result);
            return;

        }


        result.add(array[index]);
        printSubsequences(array,index+1,result);

        result.remove(result.size()-1);


        printSubsequences(array,index,result);



    }

    public static void main(String [] args){

        int [] array  = new int[]{1,2,3};
        printSubsequences(array,0, new ArrayList<>());

    }

}
