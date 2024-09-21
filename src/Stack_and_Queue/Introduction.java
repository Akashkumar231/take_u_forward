package Stack_and_Queue;


import java.util.Stack;

public class Introduction {



    public static void main(String [] args){
        Stack<Integer> stack= new Stack<>();
/*
        Array_Stack stack = new Array_Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(45);
        stack.push(45);
        stack.push(45);
        stack.push(45);

        System.out.println(stack.size());
 */

        Array_Queue queue = new Array_Queue(10);
        queue.push(79);
        queue.push(70);
        queue.push(94);
        queue.push(96);
        queue.push(52);
        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.size());

//        Stack<Integer> stack = new Stack<>();
//
//        for(int i= 1 ; i<=10 ; i++){
//            stack.push(2*i);
//        }
//
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());
//        System.out.println(stack.size());

    }

}
