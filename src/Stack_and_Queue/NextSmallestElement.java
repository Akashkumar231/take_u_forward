package Stack_and_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallestElement {


    public static int[] nextSmallestElement(int [] array ){

        int [] nextSmallest = new int[array.length];


        for(int i = array.length-1 ; i>=0 ;i--){
            boolean isSmallest = false;

            for (int j = i -1 ; j>=0 ; j--){

                if(array[i]>array[j]){
                    isSmallest= true;
                    nextSmallest[i]=array[j];
                    break;
                }

            }

            if (!isSmallest){
                nextSmallest[i]=-1;
            }



        }

        return nextSmallest;

    }

    public static int [] nextSmallestElement1(int [] array){

        Stack<Integer> ans = new Stack<>();

        int [] nextSmaller = new int[array.length];

        for(int i = 0 ; i< array.length ; i++){

            while (!ans.isEmpty() && array[i]<= ans.peek()){

                ans.pop();


            }
            if (ans.isEmpty()){
                nextSmaller[i]=-1;
            }else {
                nextSmaller[i]=ans.peek();
            }

            ans.push(array[i]);



        }

        return nextSmaller;

    }


      public static void main(String [] args){

       int []   A = {4, 5, 2, 10, 8};

    //  [-1, 4, -1, 2, 2]

       System.out.println(Arrays.toString(nextSmallestElement(A)));
       System.out.println(Arrays.toString(nextSmallestElement1(A)));


      }

}
