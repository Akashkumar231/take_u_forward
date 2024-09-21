import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {

    public static void main(String [] args){

        System.out.println("HashMap Implementation");

        HashMap<Integer,String> hash = new HashMap<>();

        // Insetion pair

        hash.put(1,"Akashkumar ");
        hash.put(2,"Prajyot Karkade");
        hash.put(3,"Piyush");

        if (hash.containsKey(3)){

            System.out.println("The key is present in your map");

        }else{

            System.out.println("The key is not present in the map");

        }

        System.out.println(hash.get(1));
        System.out.println(hash.get(65));

        // Iterating the function

        for(Map.Entry<Integer,String> e : hash.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());



        }
       Set<Integer>  key = hash.keySet();


    }

}
