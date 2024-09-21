package Arrays;

import java.util.*;

public class UnionOfArray {

  public static ArrayList<Integer> getUnion(int []array1 , int [] array2){

      ArrayList<Integer>  result  =new ArrayList<>();

      Map<Integer,Integer> finalMap = new HashMap<>();

      for(int i = 0 ; i< array1.length ;  i++){

          finalMap.put(array1[i] , finalMap.getOrDefault(array1[i],0)+1);

       }

      for(int i = 0 ; i< array2.length ;  i++){

          finalMap.put(array2[i] , finalMap.getOrDefault(array2[i],0)+1);


      }

      result.addAll(finalMap.keySet());


      return result;
  }

    public static ArrayList<Integer>  getUnion2(int [] array1 , int [] array2 ){

        HashSet<Integer>  hashSet = new LinkedHashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i= 0 ; i< array1.length ; i++){

            hashSet.add(array1[i])
            ;
        }


        for(int i= 0 ; i< array2.length ; i++){

            hashSet.add(array2[i])
            ;
        }

         Iterator<Integer> iterator = hashSet.iterator();

         while (iterator.hasNext()){

            ans.add(iterator.next());

         }

         return ans;

    }

    public static void main(String [] args){

        int [] array1 = new int[]{-7 ,8};
        int [] array2  = new int[]{-8 ,-3, 8
        };

        ArrayList<Integer> result = getUnion(array1,array2);
        System.out.println(result);

//        System.out.println(getUnion2(array1,array2));
    }

}
