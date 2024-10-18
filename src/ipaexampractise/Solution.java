package ipaexampractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String [] args){

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

//        Collections.sort(arrayList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.valueOf(o2.getSalary()).compareTo(o1.getSalary());
//            }
//        });

        Collections.sort(arrayList,new Comparator<Person>(){


            @Override
            public int compare(Person person1 , Person person2){

                return Integer.valueOf(person1.getId()).compareTo(person2.getId());

            }

        });

//        Collections.sort();

        System.out.println(arrayList);

    }

}
