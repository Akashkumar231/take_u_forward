package BinarySearchQuestions;

public class MinimumCapacityShipPackages {

    public static int getDays(int [] weights ,int capacity){

        int load = 0;
        int day = 1;

        for(int i = 0 ; i< weights.length ; i++){

            if(weights[i]+load>capacity){

                day = day +1;
                load = weights[i];

            }else {

                load+=weights[i];

            }


        }
        return day;

    }

    public static int maxElement(int [] array){

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< array.length  ; i++){

            max = Math.max(max,array[i]);

        }

        return max;
    }

    public static int getTotalSum(int [] array){

        int sum = 0;

        for (int i = 0 ; i< array.length ; i++){

            sum+=array[i];

        }
       return sum;

    }

    public static int minimumCapacityShipPackages(int [] weights , int days){

        int low = maxElement(weights);
        int high = getTotalSum(weights);
        int ans = -1;
        while (low <=high){

            int mid = low + (high - low)/2;

            int totalDays = getDays(weights,mid);

            if (totalDays<=days){
                ans = mid;
                high = mid - 1;


            }else {
                low = mid+1;
            }


        }

       return days;

    }

    public static void main(String [] args){

//        int [] weights = new int[]{
//        }

    }

}
