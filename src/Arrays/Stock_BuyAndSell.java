package Arrays;

public class Stock_BuyAndSell {


    public static int getMaxProfit1(int [] array ){

        int profit = 0;
       int  maxProfit = 0;

       for(int i = 0;i<array.length ;i++){


           for(int j = array.length-1 ; j>i ; j--){

               profit = array[j]-array[i];

                if(profit > maxProfit){

                   maxProfit = profit;
               }


           }



       }
       return maxProfit;

    }

    public static int getMaxProfit2(int [] array){

        int maxProfit = 0;

        int minPrice = Integer.MAX_VALUE;

        for(int i =0 ; i< array.length ; i++){

            if(minPrice > array[i]){

                minPrice = array[i];

            }else  if(array[i]-minPrice > maxProfit){

                maxProfit = array[i]-minPrice;

            }



        }

        return maxProfit;

    }

    public static void main(String [] args){

   int [] array =new int [] {7,6,4,3,1};
   System.out.println(getMaxProfit2(array));


    }


}
