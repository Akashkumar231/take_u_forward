package BitManipulationStriver;

public class BitFlipToConvert {

    public static int noOfBitFlip(int start , int goal){

        int newNumber = start ^ goal;

        int count = 0;

        for (int i = 0 ; i<= 31 ; i++){

            if ((newNumber & (1<<i))!=0){

                count++;

            }


        }

        return  count;
    }

    public static void main(String [] args){

        int start = 7 , goal=10;

        System.out.println(noOfBitFlip(7,10));

    }

}
