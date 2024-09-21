import java.util.HashMap;
import java.util.Map;

public class Frequencies {

    public static void main(String [] args){

        int [] arr = new int[]{2, 3, 2, 3, 5};

        int P = 5;

        int [] hasharray = new int[P+1];


        for(int i = 0 ;i<P ; i++){

            hasharray[arr[i]]+=1;

        }


        for(int i = 1 ; i<=arr.length ; i++){


            System.out.print(hasharray[i] + " ");

        }

//        int [] array = new int[]{1,2,3,5,46,4,5,6};
//
//        Map<Integer,Integer>  hashMap = new HashMap<>();
//
//        for(int i = 0 ; i< array.length ; i++){
//
//            if(hashMap.containsKey(array[i])){
//
//                hashMap.put(array[i],hashMap.get(array[i])+1);
//
//            }
//            else {
//
//
//                hashMap.put(array[i],1);
//            }
//
//        }
//        System.out.println(hashMap);
//

    }

}
