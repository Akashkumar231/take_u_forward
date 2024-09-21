package GeekForGeekQuestion;

import java.util.ArrayList;
/*

Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.


    Examples

    Input: n = 6, arr[] = {16,17,4,3,5,2}
    Output: 17 5 2
    Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.

 */

public class LeaderInArray {
    public static class LeadersInAnArray {

        public static ArrayList<Integer> getLeaderElement(int [] array){

            ArrayList<Integer>  result = new ArrayList<>();
            result.add(array[array.length-1]);
            int leadElement  = result.getLast();

            for(int i = array.length-2 ; i>=0 ; i-- ){

                if(array[i]>=leadElement){
                    result.add(array[i]);
                    leadElement=array[i];
                }

            }


            return result;

        }

        public static void main(String [] args){

      int [] array = new int[]{10,4,2,4,1};
      System.out.println(getLeaderElement(array));


        }
    }
}
