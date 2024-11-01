package ipaexampractise;

import java.util.*;

public class Solution {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        List<Customer> arrayList = new ArrayList<>();

        for (int i = 0; i< 4 ; i++)

        {

            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
//            input.nextLine();
            int bill = input.nextInt();

            Customer customer = new Customer(id,name,bill);
            arrayList.add(customer);


        }

        System.out.println(arrayList);

        Collections.sort(arrayList,new Comparator<Customer>(){

            public int compare(Customer customer1 , Customer customer2){

                return  customer2.getCustomer_Name().compareTo(customer1.getCustomer_Name());

            }


        });

           System.out.println(arrayList);

        /*
        Person p1 = new Person(1,"Akashkumar Yadav",5000);
        Person p2 = new Person(2,"Pranav Yadav",60000);
        Person p3 = new Person(3,"Prachi Yadav",65000);
        Person p4 = new Person(4,"Sunil Yadav",75000);

        List<Person> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        System.out.println(arrayList);

                Collections.sort(arrayList,new Comparator<Person>(){


            @Override
            public int compare(Person person1 , Person person2){

                return Integer.valueOf(person1.getId()).compareTo(person2.getId());

            }

        });

        System.out.println(arrayList);


         */



    }

}
