package Recursion;

import java.util.ArrayList;

public class getSubStringSeq {

    public static ArrayList<String> getSubString(String string){
        if(string.length() ==0){

            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;


        }

        ArrayList<String> gss = getSubString(string.substring(1));
        ArrayList<String> result = new ArrayList<>();

        for(String s : gss){

            result.add(""+s);

        }

        for(String s : gss){

            result.add(string.charAt(0)+s);

        }


return result;
    }

    public static void main(String [] args){

        String str = "abc";

    System.out.println(getSubString(str));

    }


}
