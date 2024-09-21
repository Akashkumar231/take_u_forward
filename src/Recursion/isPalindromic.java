package Recursion;

public class isPalindromic {

    public static boolean  isPalindromic(String string , int firstChar , int lastChar){

        if(firstChar > lastChar){
            return true;
        }

        if(string.charAt(firstChar) != string.charAt(lastChar)){

            return false;

        }

         return isPalindromic(string,firstChar+1,lastChar-1);

    }


    public static void main(String [] args){


        String string = "aamaaddaama";
        System.out.println(isPalindromic(string,0,string.length()-1));


    }



}
