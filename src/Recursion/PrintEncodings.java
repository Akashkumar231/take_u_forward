package Recursion;

public class PrintEncodings {

    /*

       1-a;
       2-b;
       3-c;
       ........
       25-y;
       26-z;


     */

    public static void PrintEncoding(String input, String output){

        if(input.isEmpty()){

            System.out.println(output);
            return;
        }



        // for first character

        char ch1 = input.charAt(0);

        if(ch1>= '1' && ch1<'9')
            PrintEncoding(input.substring(1),output+(char)(ch1-'0' + 96));



        // for two character
        if(input.length() >1){

            String ch2= input.substring(0,2);
            int integer = Integer.parseInt(ch2);

            if (integer>10 && integer<=26)
             PrintEncoding(input.substring(2),output+(char)(integer+96));


        }

    }

    public static void main(String [] args){

        PrintEncoding("1234567","");



    }

}
