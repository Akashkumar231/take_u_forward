package Stack_and_Queue;

import java.util.Arrays;
import java.util.Stack;

public class InfixToPrefix {

    public static int getPriority(char ch){


        if(ch == '^'){
            return 3;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if ( ch == '+' || ch == '-'){
            return 1;
        }
        return -1;

    }

    public static  void swap(char [] array , int first , int last){

        char temp = array[first];
        array[first]= array[last];
        array[last] = temp
                ;


    }

    public static String reverseString(String string){

        char [] charArray = string.toCharArray();

          int start = 0;
          int end = charArray.length-1;
         while (start<=end){

             swap(charArray,start,end);
             start++;
             end--;
         }

         System.out.println(Arrays.toString(charArray));
        String ans = "";
         for (int i = 0 ; i<charArray.length ;i ++){

             if (charArray[i] == ')'){
                 charArray[i] = '(';
             }
             else if (charArray[i] == '('){
                 charArray[i] = ')';
             }
             ans+=charArray[i];

         }





        return ans;


    }


    public static String convertInfixToPrefix(String input ){

        Stack<Character> stack = new Stack<>();
        input = reverseString(input);
        String ans = "";

        int start = 0 ;
        int end = input.length();

        while (start<end){
            char ch = input.charAt(start);

            if (ch>='a' && ch<='z'  || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                ans+=ch;
            } else if (ch == '(') {

                stack.push(ch);

            }else if (ch == ')'){

                while (!stack.isEmpty() && stack.peek()!='('){
                    ans+=stack.pop();
                }
                stack.pop();

            }else {

                if (ch == '^'){

                    while (!stack.isEmpty() && getPriority(ch )<= getPriority(stack.peek())){

                        ans+=stack.pop();

                    }


                }else {

                    while (!stack.isEmpty() && getPriority(ch )< getPriority(stack.peek())){

                        ans+=stack.pop();

                    }



                }

               stack.push(ch);


            }

            start++;

        }

        while (!stack.isEmpty()){
            ans+=stack.pop();
        }


        return ans;
    }

    public static void main(String [] args){

      String ans =  "(p+q)*(m-n)"

              ;

//      System.out.println(reverseString(ans));
    /*
    [i, -, ), h, *, g, +, f, (, ^, ), e, -, d, ^, c, (, *, b, +, a]
     i-)h*g+f)^)e-d^c)*b+a
     */

        System.out.println(convertInfixToPrefix(ans));

        System.out.println(reverseString(convertInfixToPrefix(ans)));

    }

}
