package Arrays;

public class MoveAllZerosToEnd {

    public static void movewithorder(int [] array)
    {

        int forward = 1;
        int backward = 0;

        for(int i = 0 ; i < array.length-1 ; i++){

            if (array[backward] != 0 ){

                backward++;

            }

            if( array[backward] ==0  && array[forward] !=0  ){

                int temp = array[forward];
                array[forward] = array[backward];
                array[backward]= temp;
                forward++;
                backward++;
            }
            forward++;

        }




    }
    public static void moveZerosEnd(int [] array ){

        int first = 0;
        int last = array.length -1;

        while (first<last){

            if(array[first]!=0){
                first++;
            }
   else
           if (array[last] == 0){

               last --;

           }else{

               int temp = array[first];
               array[first]= array[last];
               array[last]= temp ;

           }





        }



    }

    public static void main(String [] args){

 int [] array = new  int[]{ 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

 movewithorder(array);

 System.out.println(java.util.Arrays.toString(array));


    }

}
