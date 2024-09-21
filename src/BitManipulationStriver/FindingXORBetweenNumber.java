package BitManipulationStriver;

public class FindingXORBetweenNumber {


    public static int XOR_Number1(int n){

        int ans = 0;

        for(int i = 1 ; i<=n ; i++){

            ans= ans ^ i;


        }

        return ans;

    }


    public static int findingXORBetweenNumber1(int left , int right){

        int ans = 0;

       for (int i = left ; i<=right ; i++){

           ans = ans ^ i;

       }

return ans;
    }

    public static int findingXORBetweenNumber2(int left , int right){

        int number1 = XOR_Number1(left-1);
        int number2 = XOR_Number1(right);

        return number1^number2;


    }


    public static void main(String [] args){

        System.out.println(findingXORBetweenNumber1(3,7));
        System.out.println(findingXORBetweenNumber2(3,7));


    }

}
