package Arrays;

import java.util.Arrays;

public class MaximumWater {


    public static void getMaxwater(int [] array){


        int firstLargest = 0;
        int secondLargest = 0;

        for(int i = 0 ; i< array.length ;i++){

            if(array[firstLargest] < array[i]){
                secondLargest = firstLargest;
                firstLargest= i;


            }else {

                if(firstLargest != secondLargest && array[secondLargest] < array[i]){

                    secondLargest = i;

                }


            }



        }

//
//        int mxwater1 = Integer.MIN_VALUE ;
//        int maxwater2 = Integer.MIN_VALUE;
//
//        int lenght = array.length;
//
//        for(int i = 0 ; i<array.length-1; i++){
//
//
//            if(array[i] < array[i+1]){
//
//                mxwater1= i+1;
//                System.out.println(mxwater1);
//
//            }
//            else if(array[lenght-1] < array[lenght-1-i]) {
//                maxwater2= lenght-1-i;
//                System.out.println("Hello");
//                System.out.println(maxwater2);
//
//            }
//
//
//        }
//
//        int min = Math.min(mxwater1,maxwater2);
//        int maxwater = 0;
//        for(int i  =mxwater1+1 ; i<= maxwater2 ; i++){
//
//            maxwater = min - array[i];
//
//
//        }
//

System.out.println(firstLargest +""+ secondLargest);



    }

    public static void main(String [] args){

        int [] array = new int[]{0,2,4,1,0,6,5};
        Arrays.sort(array);
   getMaxwater(array);


    }

}
