package Arrays;

import java.util.Arrays;

public class LeftRotation {

    public static void swap(int [] array , int first ,int last){

        int temp = array[first];
        array[first]=array[last];
        array[last]=temp;

    }


    public static void leftRotation(int [] array, int rot){

        if(array.length % 2 != 0){

            rot = rot+1;

        }

        int temp=-1;

        for(int i = 0 ; i< rot  % array.length ; i++){

            temp  = array[0];

            for(int j = 1; j<array.length ; j++){

                 array[j-1] = array[j];


            }

             array[array.length-1]=temp;
            System.out.println(Arrays.toString(array));

        }



    }


    public static void leftRotationBy1(int [] array){
        int temp = array[0];
        for(int i =  1  ; i< array.length  ; i++){

            array[i-1]= array[i];


        }
        array[array.length-1]=temp;



    }

    public static void rotateRightBy1(int [] array ){


        int temp  = array[array.length-1];

        for(int i = array.length-1 ;  i>0 ; i--){

            array[i] = array[i-1];

        }

        array[0] = temp;

    }

    public static void main(String [] args){


        int [] array = new int[] {1,2,3,4,5,6,7};

         for(int i = 0 ; i< 3 ; i++){
             rotateRightBy1(array);

         }



//        for(int i = 0 ; i<11% array.length; i++){
//            leftRotationBy1(array);
//            System.out.print("Hello world");
//        }

        System.out.println(Arrays.toString(array));


    }

}
