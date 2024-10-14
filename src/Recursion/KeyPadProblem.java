package Recursion;

import java.util.ArrayList;
import java.util.List;

public class KeyPadProblem {




    public static List<String> getSolveKeyPad(String [] strings , String keypad){

        if (keypad.length() == 0){

            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        List<String> temp = new ArrayList<>();

        List<String> ans = getSolveKeyPad( strings,keypad.substring(1));


        char character = keypad.charAt(0);

        for (int i = 0; i < strings[character-'0'].length() ; i++){

            char ch = strings[character-'0'].charAt(i);

            for (String s : ans){

                temp.add(ch+s);

            }

        }

        return temp;

    }

    public static void main(String [] args){

        String [] strings = {",;" ,"abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        System.out.println(getSolveKeyPad(strings,"64"));

    }

}
