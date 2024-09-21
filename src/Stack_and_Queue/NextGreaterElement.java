package Stack_and_Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    public static List<Integer> getNextGreaterElement1(int [] array){

        List<Integer> ans = new ArrayList<>();
        Stack<Integer>  stack = new Stack<>();

        for(int i = 0; i< array.length ;i++){
            boolean isMax = false;
            for(int j = i+1 ; j< array.length ; j++){

                if(array[i]<array[j]){
                    isMax=true;
                    ans.add(array[j]);
                    break;

                }



            }
            if (!isMax || i==array.length-1  ){
                ans.add(-1);
            }
//            ans.add(-1);

        }




       return ans;
    }


    public static int[] getNextGreaterElement2(int [] array){

        Stack<Integer> stack = new Stack<>();

        for(int i = array.length-1 ; i>= 0 ; i--){

            int element = array[i];

            while (!stack.isEmpty() && element>= stack.peek()){
                stack.pop();
            }

            if (stack.isEmpty()){
                array[i]=-1;
            }else {
                array[i]=stack.peek();
            }

            stack.push(element);

        }

      return array;

    }

//     10,-1,6,6,2,6,7,7,9,9,10

    public static void main(String [] args){

      int  A[] = new int[] {3,10,4,2,1,2,6,1,7,2,9};

      System.out.println(Arrays.toString(getNextGreaterElement2(A)));
//      System.out.println(getNextGreaterElement1(A));

    }


}
