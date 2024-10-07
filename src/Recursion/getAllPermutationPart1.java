package Recursion;

import java.util.ArrayList;
import java.util.List;

public class getAllPermutationPart1 {

    public static void getPermutation(int [] array , boolean [] freq , List<Integer> arrayList , List<List<Integer>> res){

        if ( array.length == arrayList.size()){

            res.add(new ArrayList<>(arrayList));
            return;
        }

        for (int i = 0 ; i< array.length ; i++){

            if (!freq[i])
            {
               int element = array[i];
               freq[i]=true;
               arrayList.add(element);
               getPermutation(array,freq,arrayList,res);
               arrayList.remove(arrayList.size()-1);
               freq[i]=false;
            }


        }


    }


    public static void main(String [] args){

        int [] array  = new int[]{1,2,3};

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean [] freq = new boolean[array.length];
        getPermutation(array,freq,ans,res);
        System.out.println(res);

    }

}
