package Arrays;

public class twoSUm {


    public static void getSum(int [] array , int target){

        if(array.length == 0)
        {

            return;

        }

        for(int i = 0 ; i< array.length ;i++){

            for(int j = i+1 ; j<array.length ; j++){

                if (array[i] + array[j] == target){

                    System.out.println("Yes It exist");
                    return;

                }



            }



        }






    }

    public static void  main(String [] args){

     int   arr[] = {2,6,5,8,11}, target = 14;

    getSum(arr,target);


    }

}
