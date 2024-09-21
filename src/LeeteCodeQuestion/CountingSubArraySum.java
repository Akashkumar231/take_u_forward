package LeeteCodeQuestion;

public class CountingSubArraySum {

    public static int getCount(int [] array,int k){

        int count = 0;

        for(int i = 0; i< array.length ; i++){
            int sum =0;
            for (int j = i ; j<array.length ;j++){

                if (sum+array[j]<=k){
                    sum+=array[j];
                }

            }
            if(sum==k){
                count++;
            }

        }



        return count;

    }

    public static void main(String [] args){

        int [] array = new int[]{3, 1, 2, 4};

        System.out.println(getCount(array,6));

    }

}
