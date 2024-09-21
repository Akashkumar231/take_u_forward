package Recursion;

public class Flood_Fill {

    public static void floodFill(int [][] maze , int srcRow , int srcCol ,  String output){

        if(maze[srcRow][srcCol]==1 || maze[maze.length-1][maze[0].length-1]==1){
            return;
        }

        if (srcCol <0 || srcRow <0 || srcRow>= maze.length || srcCol>=maze[0].length || maze[srcRow][srcCol] ==1 ){

            return;

        }

        if(srcRow == maze.length-1 && srcCol == maze[0].length-1 ){
            System.out.println(output);
            return;
        }


        // Call for top
        floodFill(maze,srcRow-1,srcCol,output+"t");

        // Call for left
        floodFill(maze,srcRow,srcCol-1,output+"l");

        // Call for down
        floodFill(maze,srcRow+1,srcCol,output+"d");

        // Call for right
        floodFill(maze,srcRow,srcCol+1,output+"r");

    }


    public static void main(String [] args){

        long number= 985248361565654584l+5684848586458l;

        System.out.println(number%(1000000000+7));


    }


}
