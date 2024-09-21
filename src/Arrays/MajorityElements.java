package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static int getMajority1(int [] array ){

        int count =0;

        for(int i = 0 ; i< array.length ; i++){
          count = 0;
            int variable = array[i];

            for(int j = 0; j<array.length ; j++){

                if (array[j] == array[i]){

                    count++;
                }


            }
            if(count>array.length/2){

               return variable;
            }




        }



        return - 1;
    }

    public static int getMajority2(int [] array){

        Map<Integer , Integer> hashMap = new HashMap<>();

        for (int j : array) {

            if (hashMap.containsKey(j)) {
                hashMap.put(j, hashMap.get(j) + 1);
            } else {
                hashMap.put(j, 1);
            }
            System.out.println(hashMap);
        }

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){

            if(entry.getValue()>array.length/2){


                return entry.getKey();

            }

        }
        return -1;

    }



    //  Moore's voting algorithm

    public static int getMajority3(int [] array){

      int count = 0 ;
      int element = 6;

      for(int i = 0 ; i< array.length ;i++){

          if(count == 0){
              count++;
              element= array[i];


          } else if (element == array[i]) {
              count++;
          }else {

              count--;
          }


      }


        return element;
    }

    public static void main(String [] args){


   int [] array = new int[]{2,2,1,1};
   System.out.println(getMajority3(array));

    }

}
