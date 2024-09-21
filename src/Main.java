import java.util.*;

public class Main {

    public static void main(String[] args) {

     Map<Integer,String>  map = new HashMap<>();
     map.put(1,"Akashkumar");
     map.put(2,"Prajyot");
     map.put(3,"Piyush");

     System.out.println(map.get(1));
     System.out.println(map.put(1,"KumarYadav"));
     System.out.println(map);

     for(Map.Entry<Integer,String>  entry : map.entrySet()){

         System.out.println(entry.getKey());
         System.out.println(entry.getValue());


     }

//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.offer(45);
//        queue.offer(65);
//        queue.offer(75);
//
//        System.out.println(queue);
//         System.out.println(queue.peek());
//         System.out.println(queue.poll());

//        Stack<String>  animals = new Stack<>();
//
//        animals.add("Monkey");
//        animals.add("Gorilla");
//        animals.add("Black Panther");
//        animals.add("Cheetah");
//        animals.push("Snake");
//
//        System.out.println(animals.peek());
//        System.out.println(animals.pop());
//        System.out.println(animals);
//        System.out.println(animals.peek());

//        System.out.println("Hello world!");

//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for(int i = 1; i<=10 ; i++ ){
//
//            arrayList.add(2*i);
//
//
//        }
//
//        arrayList.add(2,50);
////        ArrayList<Integer> arrayList1 = new ArrayList<>();
////        arrayList1.add(45);
////        arrayList1.add(65);
////        arrayList.addAll(arrayList1);
////        arrayList.remove(65);
////        arrayList.clear();
////     System.out.println(arrayList);
//
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}