package Stack_and_Queue;

import java.util.Arrays;

public class NumberOfNgeToRight {


    public static int[]  getNge(int [] array , int []indices){

        int [] ans = new int[indices.length];

        for(int i = 0 ; i< indices.length ; i++){
            int countMax = 0;
            for (int j = indices[i]+1 ; j<array.length ; j++){

                if (array[indices[i]]<array[j]){
                    countMax++;
                }

            }

            ans[i]=countMax;

        }

        return ans;


    }

    public static void main(String [] args){

       int arr[]     = new int[] {1, 2, 3, 4, 1};

        int indices[] = new int[]{0, 3};

        System.out.println(Arrays.toString(getNge(arr,indices)));

    }

}
