package LinkedList;


 class Node{

     int data;
     Node next;

     public Node(int data){

         this.data = data;
         this.next= null;

     }


}

public class IntroductionToLinkedList {

     public static void traverseLinkedList(Node head){

         Node temp= head;

         while (temp.next!=null){

             System.out.print(temp.data+ "-->");
             temp = temp.next;

         }
         System.out.print("null");

     }

     public static int getLength(Node head){

         int count = 0;

         Node temp= head;

         while (temp.next!=null){

             temp = temp.next;
             count++;

         }

         return count;

     }

     public static boolean checkDataIsPresent(Node head , int val){


         Node temp = head;

         while (temp.next!=null){

             if (temp.data == val){
                 return true;
             }
             temp = temp.next;


         }
         return false;
     }


    public static void main(String [] args){


        int [] array = new int [] {1,2,3,4,5,6};

        Node head = new Node(array[0]) ;
        Node temp= head;

        for(int i = 1 ; i<array.length ; i++){

            Node node = new Node(array[i]);
            temp.next=node;
            temp=temp.next;

        }

        traverseLinkedList(head);
        System.out.println();
        System.out.println("The length of the LinkedList is " + getLength(head));
        System.out.println("The value is present in the LinkedList : " + checkDataIsPresent(head,3));

    }

}
