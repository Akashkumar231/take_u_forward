package Stack_and_Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinStack {

    Stack<Pair> stack = new Stack<>();

    private int min_Value  = Integer.MIN_VALUE;


    public void push(int value)
    {

        if (stack.isEmpty()){
             min_Value=value;
             Pair pair = new Pair(value,min_Value);
             stack.push(pair);
        }else {
            min_Value = Math.min(min_Value,value);
            Pair pair = new Pair(value,min_Value);
            stack.push(pair);
        }

    }

    public int peek(){
        return stack.peek().value;
    }

    public int pop(){

        int popValue = stack.pop().value;
        min_Value = stack.peek().minValue;

       return popValue;
    }

    public int getMin_Value(){
        System.out.println(stack);
        return stack.peek().minValue;
    }

    @Override
    public String toString() {
        return stack+"";
    }

    private  class Pair{

        int value;
        int minValue;

        Pair(int value , int minValue){

            this.value = value;
            this.minValue=minValue;

        }

        public String toString() {
            return "{" + this.value+","+this.minValue + "}";
        }


   }

    public static void main(String [] args){

     MinStack minStack = new MinStack();

     minStack.push(-10);
     minStack.push(14);
     System.out.println(minStack.getMin_Value());
     System.out.println(minStack.getMin_Value());
     minStack.push(-20);
     System.out.println(minStack.getMin_Value());
     System.out.println(minStack.getMin_Value());
     System.out.println(minStack.peek());
     System.out.println(minStack.getMin_Value());
     System.out.println("The min value : " + minStack.pop());
     System.out.println(minStack);
     minStack.push(10);
     minStack.push(-7);
     System.out.println(minStack.getMin_Value());
     minStack.push(-7);
     System.out.println("The min value : " + minStack.pop());
     System.out.println(minStack.peek());
     System.out.println(minStack.getMin_Value());
     System.out.println(minStack.pop());
//   minStack.push(45);
//   minStack.push(65);
//   minStack.push(1);
//   minStack.push(-56);
//   minStack.push(65);
//
//
//     System.out.println(minStack);
//     System.out.println(minStack.getMin_Value());
//
//     System.out.println(minStack.pop());
//     System.out.println(minStack.pop());
//     System.out.println(minStack.getMin_Value());


    }


}
