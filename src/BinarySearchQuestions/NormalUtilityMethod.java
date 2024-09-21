package BinarySearchQuestions;

public class NormalUtilityMethod {

    public static int getSum(int [] array){
        int sum = 0 ;
        for (int j : array) {

            sum += j;
        }

        return sum;
    }

    public static int getMax(int [] array){

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< array.length ;i++){

            max = Integer.max(max,array[i] );
        }
        return max;

    }

}
