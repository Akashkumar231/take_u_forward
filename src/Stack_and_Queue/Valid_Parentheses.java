package Stack_and_Queue;

import java.util.Stack;

public class Valid_Parentheses {


    public static boolean checkValid( Stack<Character> parenthesisStack, String string){


       int end = string.length();
       for(int i = 0; i< end ;i++){
           if (string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{')
               parenthesisStack.push(string.charAt(i));
           else {
               if(parenthesisStack.isEmpty()) return false;
               char ch = parenthesisStack.pop();
               if((string.charAt(i) == ')' && ch == '(') ||  (string.charAt(i) == ']' && ch == '[') || (string.charAt(i) == '}' && ch == '{')) continue;
               else return false;
           }
       }
        return parenthesisStack.isEmpty();
    }

    public static void main(String [] args){

        String str = "()[{}()]";

        Stack<Character> parenthesisStack = new Stack<>();

        System.out.println(checkValid(parenthesisStack,str));


    }

}
