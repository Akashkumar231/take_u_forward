public class NumberOfDigits {

    public static int getDigits(int n ){

        int count = 0;

        while (n!=0){
            n = n /10;
            count++;
        }

        return count;

    }

    public static int getDigitsEfficient(int n){


        int count =     (int)Math.log10(n)+1;
        return count;

    }

    public static void main(String [] args){


    System.out.println(getDigits(789465610));


    }

}
