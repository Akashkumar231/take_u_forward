package Stack_and_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {


    public static int[] nextGreaterElement2_1(int [] array){

        int [] ans = new int[array.length];

        for (int i = 0 ; i< array.length ; i++){

            boolean isMax = false;
            for (int j = i+1 ; j< i+array.length-1 ; j++){

                if(array[i] < array[j%array.length] ){
                    isMax = true;
                    ans[i]= array[j % array.length];
                    break;
                }



            }

            if (!isMax){
                ans[i]=-1;
            }

        }



        return ans;
    }

    public static int [] nextGreaterElement2_2(int [] array){

        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[array.length];

        for(int i = 2*array.length-1; i>=0 ; i--){

            while (!stack.isEmpty() && stack.peek()<= array[i%array.length]){
                stack.pop();
            }

           if (i<array.length){

               if (stack.isEmpty()){
                   ans[i]=-1;
               }else {
                   ans[i]=stack.peek();
               }

           }

           stack.push(array[i%array.length]);

        }


        return ans;

    }




    public static void main(String [] args){


        int  A[] = new int[] {3,10,4,2,1,2,6,1,7,2,9};
        System.out.println(Arrays.toString(nextGreaterElement2_1(A)));
        System.out.println(Arrays.toString(nextGreaterElement2_2(A)));
    }


}
