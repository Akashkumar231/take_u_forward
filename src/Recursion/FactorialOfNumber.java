package Recursion;

public class FactorialOfNumber {


    public static void fact(int n, int fact){

        if(n==1){

            System.out.println(fact);
            return;
        }

        fact(n-1 , fact*n);


    }

    public static int getFact(int n ){

        if(n == 1){
            return 1;
        }

        return n* getFact(n-1);


    }

    public static void main(String [] args){

        System.out.println(getFact(5));

    }



}
