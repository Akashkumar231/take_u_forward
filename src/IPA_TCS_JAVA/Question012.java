package IPA_TCS_JAVA;

import java.util.Scanner;

public class Question012 {


    public static int   findPriceForGivenBrand(Phone [] array , String brand){

        int sum = 0;

        for(int i = 0 ; i< array.length ; i++){

            if (array[i].getBrand().equalsIgnoreCase(brand)){

                sum+=array[i].getPrice();

            }

        }

        return sum;


       }


       public static Phone getPhoneIdBasedOnOs(Phone [] array , String Os){

        for(int i = 0 ; i< array.length ;i++){

            if (array[i].getOS().equalsIgnoreCase(Os) && array[i].getPrice() >= 50000){

                return array[i];



            }

        }
        return null;


       }

    public static void main(String [] args){

        Phone [] array  = new Phone[4];

        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i < 4 ; i++){

            int a= input.nextInt();
            input.nextLine();
            String b = input.nextLine();
            String c = input.nextLine();
            int d = input.nextInt();

            array[i]= new Phone(a,b,c,d);

        }

        input.nextLine();
        String bname = input.nextLine();
        String os = input.nextLine();

        int price = findPriceForGivenBrand(array,bname);
        if(price > 0){

          System.out.print(price);


        }else {
            System.out.print("The given brand is not available");
        }


        Phone phone = getPhoneIdBasedOnOs(array,os);

        if(phone == null){

            System.out.print("No phones are available with specified os and price range");

        }else{
            System.out.print(phone.getPhoneId());

        }

    }

}
