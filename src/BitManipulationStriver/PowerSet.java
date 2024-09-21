package BitManipulationStriver;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>>  getList(int [] array){

        List<List<Integer>> ans = new ArrayList<>();

        int subsets = 1<< array.length;

        for(int nums = 0 ; nums <= subsets-1 ; nums++){

            List<Integer> list = new ArrayList<>();

            for (int i = 0 ;  i<array.length ; i++){

                if ((nums & 1<<i)!=0){
                    list.add(array[i]);
                }


            }ans.add(list);



        }


        return ans;


    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,3};

        System.out.println(getList(array));


    }

}
