package Stack_and_Queue;

import java.util.Arrays;

public class TrappingRainwater {

    public static int [] prefixMax(int [] array){

        int [] prefix = new int[array.length];
        prefix[0]=array[0];

        for (int i = 1 ; i< prefix.length ; i++){

           prefix[i]= Math.max(prefix[i-1],array[i]);
        }

        return prefix;

    }


    public static int[] suffixMax(int [] array){

        int [] suffixMax = new int[array.length];

        suffixMax[array.length-1] = array[array.length-1];

        for(int i = array.length-2 ; i>=0 ;i-- ){

            suffixMax[i] = Math.max(array[i] ,suffixMax[i+1]);

        }

        return suffixMax;

    }

    public static int getTotalWater(int [] array , int [] prefix ,int [] suffix){


        int total = 0;

        for(int i = 0 ; i< array.length ;i++){

         int leftMax = prefix[i];
         int rightMax = suffix[i];

         if (array[i]< leftMax && array[i]<array[rightMax]){

             total+=Math.min(leftMax,rightMax)-array[i];

         }




      }



        return total;



    }

    public static void main(String [] args){

        int [] array = new int[]{2,1,0,5,3};

        System.out.println(Arrays.toString(prefixMax(array)));
        System.out.println(Arrays.toString(suffixMax(array)));


    }
}
