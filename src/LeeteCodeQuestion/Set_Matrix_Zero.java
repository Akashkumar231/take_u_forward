package LeeteCodeQuestion;

import java.util.Arrays;

public class Set_Matrix_Zero {


    public static void setMatrixZero(int [][] nums){

        int row = nums.length;
        int col = nums[0].length;

        for (int i  = 0 ; i< row ; i++){


            for (int j = 0 ;j <col ;j++){

                if(nums[i][j]==0){

                    for(int rowNo = 0; rowNo<row ; rowNo++){
                       if(nums[rowNo][j]!=0)
                        nums[rowNo][j]=-1;

                    }


                    


                }


            }

        }
            for(int i = 0 ; i< nums.length ;i++){

                System.out.println(Arrays.toString(nums[i]));

            }

    }


    public static void setMatrixZeroOptimal(int [][] nums){

        int[] row = new int[nums.length];
        int [] col = new int[nums[0].length];

        for(int rowNo=0 ; rowNo<row.length ; rowNo++){

            for(int colNo = 0; colNo< col.length ; colNo++){

                if(nums[rowNo][colNo]==0){

                    row[rowNo]=1;
                    col[colNo]=1;

                }

            }


        }


        for(int rowNo=0 ; rowNo<row.length ; rowNo++){

            for(int colNo = 0; colNo< col.length ; colNo++){

                if(row[rowNo]==1 || col[colNo]==1){

                    nums[rowNo][colNo]=0;

                }

            }


        }

        for(int i = 0 ; i< nums.length ;i++){

            System.out.println(Arrays.toString(nums[i]));

        }



    }

    public static void main(String [] args){

      int [][]  matrix =  new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

//      setMatrixZero(matrix);
        setMatrixZeroOptimal(matrix);



    }

}
