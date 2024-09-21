package Stack_and_Queue;

import java.util.Stack;

public class PrefixToInfix {


    public static String prefixToInfix(String input){

        Stack<String>  stack = new Stack<>();

        int start = 0 ;
        int end = input.length()-1;

        while (end>=start){
            char ch = input.charAt(end);

            if (ch >= 'a' && ch<='z'   || ch>='A' && ch<='Z' || ch>='0' && ch<='9' ){

                stack.push(ch+"");

            }else {

                String top1  = stack.pop();
                String top2  = stack.pop();
                String newTop = "(" + top1 + ch + top2 + ")";
                stack.push(newTop);

            }
            end--;


        }
        return stack.peek();

    }

    public static void main(String [] args){

    String  string = "*+PQ-MN";

    System.out.println(prefixToInfix(string));


    }

}
