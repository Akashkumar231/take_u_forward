package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rearrangeArray {


    public static void rearrange(int [] array){

        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for(int i = 0 ; i< array.length ;i++){

            if (array[i] > 0){
                posList.add(array[i]);
            }else{
                negList.add(array[i]);
            }

        }
        /*

            i = 0
             array[0] =

        */

        for(int i = 0 ; i< posList.size() ; i++){

            array[2*i]= posList.get(i);
            array[2*i+1] = negList.get(i);


        }

    }

    public static void main(String [] args){

        int [] array =  {1,2,-3,-1,-2,-3};

          System.out.println(java.util.Arrays.toString(array));
          rearrange(array);
          System.out.println(java.util.Arrays.toString(array));

//          Scanner input = new Scanner(System.in);
//          int n  = input.nextInt();
//
//          ArrayList<Integer>  ans = new ArrayList<>();
//
//          for(int i = 1 ;  i<= n  ;i ++){
//              if(n%i == 0){
//                  ans.add(i);
//              }
//
//          }
//
//
//          // this will calculate the sum
//
//           int sum = 0;
//
//          for(int element : ans){
//
//              sum+=element;
//          }
//
//        System.out.println(sum);

//        Scanner input = new Scanner(System.in);
//        int input1 = input.nextInt();
//        int input2  = input.nextInt();
//        int input3 = input.nextInt();
//        int [] input4 = new int[]{1,1,1,0};
//
//
//
//
//        int mxCoins = 0;
//        int myCoins = 0;
//
//        for(int i = 0;i<input4.length ;i++){
//
//            if(input4[i] == 0){
//
//                mxCoins=mxCoins+input2;
//            }
//
//
//        }
//        System.out.println(mxCoins);
//
//        for(int i = 0;i<input4.length ;i++){
//
//            if(input4[i]== 1){
//
//                myCoins=myCoins+input3;
//            }
//
//
//        }
//        System.out.println(myCoins);
//
//  int max = Math.min(mxCoins,myCoins);
//
//        System.out.println(max);


    }


}
