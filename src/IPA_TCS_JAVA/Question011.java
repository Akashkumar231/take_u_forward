package IPA_TCS_JAVA;

import java.util.Scanner;

public class Question011 {

    public static int firstMethod(TravelAgencies [] array){

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< array.length ; i++){

            if (array[i].getPrice()>max){
                max = array[i].getPrice();
            }

        }

        if (max<0){
            return 0;
        }

        return max
                ;

    }

    public static TravelAgencies method2(TravelAgencies [] array  ,int regNo , String packType){


       for(int i = 0 ; i< array.length ; i++){


           if (array[i].flightFacility == true){

               if (array[i].getRegNo() == regNo && array[i].getPackageTye().equals(packType)){

                   return array[i];

               }


           }

       }

       return null;






    }

    public static void main(String [] args){

        TravelAgencies [] array = new TravelAgencies[4];
        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i< array.length ; i++){


            int regNo =  input.nextInt();
            input.nextLine();
            String agenecyName = input.nextLine();

            String packageTye = input.nextLine();
            int price = input.nextInt();
//            input.nextLine();
            boolean flightF = input.nextBoolean();

            array[i]= new TravelAgencies(regNo,agenecyName,packageTye,price,flightF);

        }

        int intVal = input.nextInt();
        String stringVal = input.next();

        int maxNumber = firstMethod(array);

        System.out.print(maxNumber);

        TravelAgencies result = method2(array,intVal,stringVal);

        System.out.print(maxNumber);

        System.out.print(result.getAgencyName() + ":" + result.getPrice());

    }

}
