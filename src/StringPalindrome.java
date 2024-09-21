public class StringPalindrome {


    public static boolean isPalindrome(String string , int firstIndex, int lastIndex){

        if (firstIndex>=lastIndex){

            return true;


        }
       if (string.charAt(firstIndex) != string.charAt(lastIndex)){

           return false;

       }

       return isPalindrome(string,firstIndex+1,lastIndex-1)
;

    }

    public static void main(String [] args){
        String s =  "A man, a plan, a canalsdfsdf: Panama";
        String totalString = "";

        for(int i = 0 ; i< s.length()  ;i++){

            char ch = s.charAt(i);

            if( ch >= 65 && ch<=90 || ch >=97 && ch<=122 ){

                totalString = totalString + ch;

            }


        }

        String ans = totalString.toLowerCase();

        System.out.println(ans);


        char [] ch = ans.toCharArray();

        for(int i = 0 ; i<ch.length ; i++){

            if (ch[i] != ch[ch.length-1-i]){

                System.out.println("Not a Palindromic Strig");
               return;

            }


        }

        System.out.println("Palindromic String");

//         String s = "Akashkumar";
//
//         System.out.println(isPalindrome(s,0,s.length()-1));


//        int s = Integer.parseInt("650");
//
//        String akash = String.valueOf(s);
//
//        System.out.println(s);
//        System.out.println(akash);

    }

}
