package LeeteCodeQuestion;

import java.util.Arrays;

public class RotateMatrix90Degree {


    public static void swapMatrix(int [][] matrix , int firstRow, int firstCol , int secondRow, int secondCol){


        
    }


    public static void rotateMatrix90Degree(int [][] matrix){

        int [][]refMatrix = new int[matrix.length][matrix[0].length];
        int length = matrix.length;

        for(int i= 0 ; i< length ; i++){

            for(int j = 0; j<length ; j++){

                refMatrix[j][length-1-i]=matrix[i][j];


            }

        }

       for(int i = 0; i< matrix.length; i++){

           System.out.println(Arrays.toString(refMatrix[i]));


       }




    }

    public static void main(String [] args){

        int [][] matrix = new int [][] {{1,2,3},{4,5,6},{7,8,9}};

    rotateMatrix90Degree(matrix);


    }


}
