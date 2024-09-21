package Stack_and_Queue;

import java.util.Stack;

public class InfixToPostfix {


    public static int givePriority(char ch){

        if(ch == '^'){
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }

        return -1;

    }

    public static String infixToPostfixConversion(String input ){

        String ans = "";

        Stack<Character> stack = new Stack<>();

        int start = 0 ;
        int end = input.length();

        while (start<end){

            char ch = input.charAt(start);

            if (ch >= 'a' && ch<='z'   || ch>='A' && ch<='Z' || ch>='0' && ch<='9' ){

                ans+=ch;

            }
            else if(ch == '('){

                stack.push(ch);

            } else if (ch ==')') {

                while (!stack.isEmpty() && stack.peek()!='('){

                    ans+=stack.pop();



                }

                    stack.pop();

            }
           else {

               while (!stack.isEmpty() && givePriority(ch) <= givePriority(stack.peek())){

                   ans+=stack.pop();



               }
               stack.push(ch);


            }

            start++;

        }

         while (!stack.isEmpty()){
             ans+=stack.peek();
             stack.pop();
         }

        return ans;
    }

    public static void main(String [] args){

        String input = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println(infixToPostfixConversion(input));


    }

}
