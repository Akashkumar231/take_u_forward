package Recursion;

public class PrintMazePaths {


    public static void printMazePaths(int sourceRow , int sourceCol , int destinationRow , int destinationCol, String psf){


        if(sourceRow > destinationRow || sourceCol>destinationCol){

            return;

        }

        if(sourceRow == destinationRow && sourceCol==destinationCol){
            System.out.println(psf);
            return;
        }

        // Horizontal Call

        printMazePaths(sourceRow,sourceCol+1,destinationRow,destinationCol,psf+"r");

        // Vertical

        printMazePaths(sourceRow+1,sourceCol,destinationRow,destinationCol,psf+"c");





    }

    public static void main(String [] args){

        printMazePaths(0,0,1,1,"");

    }


}
