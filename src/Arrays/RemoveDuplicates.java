package Arrays;

public class RemoveDuplicates {


    public static void reedOfDuplicates(int [] array ){

        int forwardPointer = 0;
        int backwardPointer = 0;

        for(int i = 0 ; i< array.length ; i++){

            if(array[forwardPointer] == array[backwardPointer]){
                 forwardPointer++;
            }

          else {

                backwardPointer++;
                int temp =array[ backwardPointer];
                array[ backwardPointer]=array[forwardPointer];
                array[forwardPointer] = temp;
                forwardPointer++;


            }

        }



    }

    public static void main(String [] args){



        int [] array = new int[]{0,0,1,1,1,2,2,3,3,4};
        reedOfDuplicates(array);
        System.out.print(java.util.Arrays.toString(array));

    }

}
