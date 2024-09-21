package Recursion;

public class PrintPath {

    public static void printPath(int n , String output){

        if(n==0){

            System.out.println(output);
            return;

        }

        if(n-1>=0) {
            printPath(n - 1, output + "1");
        } if(n-2>=0) {
            printPath(n - 2, output + "2");
        } if(n-3>=0) {
            printPath(n - 3, output + "3");
        }





    }


    public static void main(String[] args){

        printPath(4,"");

    }

}
