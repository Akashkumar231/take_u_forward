package Recursion;

public class SumOfFirstNaturalNumbers {


    public static void sumNaturalNumber(int n , int sum){

        if(n<1){

            System.out.println(sum);
            return;

        }

        sumNaturalNumber(n-1,sum+n);


    }

    public static int getSum(int n){

        if(n==1){

            return 1;

        }

        int sum =n+ getSum(n-1);

        System.out.println("Value of sum : " + sum + "the value of n :" + n);

        return sum;

    }

    public static void main(String [] args){


      System.out.println(getSum(10));

    }


}
