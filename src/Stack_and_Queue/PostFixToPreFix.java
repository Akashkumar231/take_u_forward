package Stack_and_Queue;

import java.util.Stack;

public class PostFixToPreFix {

    public static String postFixToPreFix(String input){

        Stack<String> stack =new Stack<>();

        int start =  0;
        int end = input.length();

        while (start< end){
            char ch = input.charAt(start);

            if (ch >= 'a' && ch<='z'   || ch>='A' && ch<='Z' || ch>='0' && ch<='9' ){

                stack.push(ch+"");

            }else {

                String top2  = stack.pop();
                String top1  = stack.pop();
                String newTop =  ch  + top1 + top2 ;
                stack.push(newTop);

            }
            start++;


        }


return stack.pop();


    }

    public static void main(String [] args){

        System.out.println(postFixToPreFix("AB-DE+F*/"));

    }

}
