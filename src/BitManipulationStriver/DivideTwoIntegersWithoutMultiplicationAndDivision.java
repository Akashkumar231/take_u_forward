package BitManipulationStriver;

public class DivideTwoIntegersWithoutMultiplicationAndDivision {


    public static int getDivideTwoInteger1(int dividend , int divisor){

        if (dividend == divisor){

            return 1;

        }

        boolean sign = true ;  // It is positive.

        if(dividend>=0 && divisor<0 ){

          sign=false;

        } else if (dividend<=0 && divisor>0) {

            sign= false;
        }

        int n = Math.abs(dividend);
        int d = Math.abs(divisor);

        divisor = Math.abs(divisor);

        int quotient = 0;

        while (n >= d){

            int count = 0;

            while (n >= (d<<count+1)){
                count+=1;
            }

            quotient += 1<<count;
            n = n - (d<<count);


        }

        if(quotient == (1<<31) && sign){

            return Integer.MAX_VALUE;

        }

        if(quotient == (1<<31) && !sign){

            return Integer.MIN_VALUE;

        }

        return sign ? quotient : -quotient;
    }

//
//    public static int getDivideTwoInteger2(int dividend , int divisor){
//
//
//
//
//    }



    public static void main(String [] args){

        System.out.println(getDivideTwoInteger1(22,3));

    }

}
