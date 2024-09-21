public class GCD {

  public static int getGCD(int number1 , int number2){

      for (int i= Integer.max(number1,number2) ; i >=1 ; i--){

          if(number1%i ==0 && number2%i == 0){

              return i;

          }


      }
   return 1;


  }

    public static int optimalWay(int number1 , int number2){


        while (number1>0 && number2>0){

           if (number1>number2)
               number1 = number1 % number2;

           else
               number2 = number2 %  number1;

        }

         if (number1 ==0){
             return number2;
         }

           return number1;


    }

    public static void main(String [] args){

      System.out.println(optimalWay(10,20));


    }

}
