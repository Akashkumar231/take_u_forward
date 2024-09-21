package Arrays;

public class SortedRotated {


    public static boolean check(int [] array){

        int count = 0 ;

        for(int i = 0 ; i< array.length ; i++){

            if(array[i] > array[(i+1)% array.length]){

                count++;

            }
            if (count>1){

                return false;

            }
        }


        return true;

    }


    public static void main(String [] args){


       int [] array = new int[]{2,1,3,4};

       System.out.print(check(array));

    }


}
