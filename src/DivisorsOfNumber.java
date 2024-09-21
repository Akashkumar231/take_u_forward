import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DivisorsOfNumber {

    public static Set<Integer> getDivisors(int number){

        Set<Integer> ans = new HashSet<>();

        for(int i = 1 ; i<= number ; i++){

            if (number % i ==0){

                ans.add(i);

            }

        }

              return ans;

    }

    public static Set<Integer> optimalWay(int number){

        Set<Integer> ans = new HashSet<>();
        for(int i = 1 ; i<= Math.sqrt(number) ; i++){

            if (number % i ==0){
                int quotient = number / i;
                ans.add(i);
                ans.add(quotient);
            }

        }
        return ans;

    }

    public static void main(String [] args){


       System.out.println(getDivisors(36));
        System.out.println(optimalWay(36));
    }

}
