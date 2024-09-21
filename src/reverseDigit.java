public class reverseDigit {

    //1234
    public static int reverseDigit(int number){

        int newDigit = 0;

        while (number!=0){

            int remainder = number % 10;
            newDigit = newDigit*10+ remainder;
            number = number / 10;


        }

        return newDigit;

    }

    public static void main(String[] args){


        System.out.println(reverseDigit(12345));


    }

}
