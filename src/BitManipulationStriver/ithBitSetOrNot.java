package BitManipulationStriver;

public class ithBitSetOrNot {

    public static boolean isSet(int number, int k){

        if( ((number>>k )& 1 )==0){

            return  false;

        }

       return true;

    }


    public static void main(String [] args){

      System.out.println(isSet(5,1));


    }

}
