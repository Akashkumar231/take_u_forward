package String;

public class CountTheNumberOfConsistentStrings {

    public static boolean isConsistent(String allowed, String toCheck){

        for (int i = 0 ; i<toCheck.length(); i++){


            if (!allowed.contains(toCheck.charAt(i)+"")){
                return false;
            }

        }

        return true;

    }


    public static int countConsistent(String [] array , String allowed){

        int count = 0;

        for (int i =0  ; i< array.length ; i++){

            if(isConsistent(allowed,array[i])){
                count++;
            }

        }

        return count;

    }

    public static void main(String [] args){

      String  allowed = "cad" ;
        String [] words = {"cc","acd","b","ba","bac","bad","ac","d"};

      System.out.println(countConsistent(words,allowed));


    }

}
