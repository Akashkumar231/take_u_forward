package BinarySearchQuestions;

public class BookAllocationProblem {


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

     public static int getNumberOfStudents(int [] array , int pages){

        int student = 1;
        int pagesStudent = 0;

        for(int i = 0 ; i< array.length ; i++){

            if(pagesStudent+ array[i] <= pages){
                pagesStudent+=array[i];
            }else {
                student++;
                pagesStudent=array[i];

            }



        }


        return student;



     }

    public static int getMaxPages(int [] array , int student){

        if (student > array.length){
            return -1;
        }

        if (student == 1){
            return getSum(array);
        }

        int low = getMax(array);
        int high = getSum(array);

        for(int i = low ; i<= high ;i++){

            if(getNumberOfStudents(array,i)==student){
                return i;
            }



        }
      return low;


    }

    public static void main(String [] args){
        int [] array = new int [] {12,34,67,90};
        int m = 56;

        System.out.println(getMaxPages(array,m));


    }

}
