package Recursion;

import java.util.ArrayList;
import java.util.List;

public class getSubsequences {

    public static List<String> getSubsequence(    String string){

        if( string.length() == 0){

            List<String> temp = new ArrayList<>();
            temp.add("");
            return temp;

        }

        List<String> res = getSubsequence(string.substring(1));

        List<String> ans = new ArrayList<>();

        for (String s : res){

            ans.add(""+s);

        }

        for (String s : res){
            ans.add(string.charAt(0)+s);
        }


      return ans;


    }

    public static void main(String [] args){

    String ans = "abc";

    System.out.println(getSubsequence(ans));

    }

}
