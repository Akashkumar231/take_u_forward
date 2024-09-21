package BitManipulationStriver;

public class FindXOR {

    // Brute Force Approach.
    public static int XOR_Number1(int n){

        int ans = 0;

        for(int i = 1 ; i<=n ; i++){

            ans= ans ^ i;


        }

         return ans;

    }

    public static int XOR_Number2(int n){

        if (n%4==1){

            return 1;

        } else if (n%4==2) {

            return n+1;

        }else if (n%4==3){

            return 0;

        }

        return n;

    }


    public static void main(String [] args){

        System.out.println(XOR_Number2(13));

    }

}
