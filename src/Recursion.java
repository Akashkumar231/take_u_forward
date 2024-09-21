import java.util.Arrays;

public class Recursion {

    public static void swap(int [] array , int firstIndex , int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex]= temp;


    }


    public static void reverseArray(int [] array , int index , int end){

      if (index>=end){

          return;
      }

        swap(array,index,end);

        reverseArray(array,index+1,end-index-1);


    }

    public static void main(String [] args){

        int [] array = {1,2,3,4,5};

        reverseArray(array,0,array.length-1);

        System.out.println(Arrays.toString(array));

    }


}
