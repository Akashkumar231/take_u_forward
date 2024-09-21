package LinkedList;

import java.util.LinkedList;

public class InsertGreatestCommonDivisors {


    public static int findGCD(int a , int b){

        if (b==0){
            return a;
        }
        return findGCD(b,a%b);


    }



    public static void main(String [] args){

        LinkedList<Integer> listNode = new LinkedList<>();

        System.out.println(listNode);


    }

}
