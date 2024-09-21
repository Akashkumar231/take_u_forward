package LeeteCodeQuestion;

public class SpiralOfMatrix {

    public static void printSpiral(int [][] matrix){

        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd= matrix.length-1;
        int colEnd = matrix[0].length-1;

        while (rowBegin<=rowEnd && colBegin<=colEnd){

            for(int i = colBegin ; i<=colEnd; i++){
                System.out.print(matrix[rowBegin][i]+" ");
            }

            rowBegin++;



                for(int i = rowBegin ; i<=rowEnd ; i++){

                    System.out.print(matrix[i][colEnd]+" ");


            }
             colEnd--;

       if(rowBegin<rowEnd){

           for(int i = colEnd ; i>=colBegin ; i--){

               System.out.print(matrix[rowEnd][i]+" ");

           }


       }
         rowEnd--;

       if(colBegin<=colEnd){

           for(int i = rowEnd ; i>=rowBegin; i--){

               System.out.print(matrix[i][colBegin]+" ");

           }

       }

       colBegin++;

        }



    }

    public static void main(String [] args){

      int [][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      printSpiral(matrix);


    }

}
