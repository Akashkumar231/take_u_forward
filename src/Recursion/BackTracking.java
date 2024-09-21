package Recursion;

public class BackTracking {


    public static void printBack(int n){

        if (n<0){
            return;
        }


        printBack(n-1);
        System.out.print(n);

    }

    public static void main(String [] args){

        printBack(10);


    }

}
