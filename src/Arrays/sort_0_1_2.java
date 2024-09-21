package Arrays;

public class sort_0_1_2 {


    public static void swap(int [] array , int first , int second){

  int temp = array[first];
  array[first] = array[second];
  array[second] =temp;




    }

  public static void sort1(int [] array ){


      java.util.Arrays.sort(array);

  }

   public static void sort2(int [] array){

      if(array.length == 0 || array.length==1){

          return
                  ;
      }

      int count_0  =0;
      int count_1 = 0;
      int count_2 = 0;

      for(int i = 0 ; i< array.length ; i++){
          if(array[i] == 0)
              count_0++;
          if (array[i]== 1)
              count_1++;
          if (array[i]==2)
              count_2++;
      }

      int j = 0;
      while (count_0>0){
          array[j]=0;
          count_0--;
          j++;
      }


       while (count_1>0){
           array[j]=1;
           count_1--;
           j++;
       }


       while (count_2>0){
           array[j]=2;
           count_2--;
           j++;
       }


   }

   public static void sort3(int [] array ){

      int low = 0;
      int mid = 0;
      int high = array.length -1;

      while (mid<=high){

          // check for 0

          if(array[mid] == 0){
              swap(array,low, mid);
              low++;
              mid++;

          }

         else if(array[mid] == 1){

              mid++;


          }
 else {

      swap(array,mid,high);
      high--;

  }





      }




   }

    public static void main(String [] args){


   int [] array = new int [] {2,0,2,1,1,0};
   sort3(array);

   System.out.println(java.util.Arrays.toString(array));


    }
}
