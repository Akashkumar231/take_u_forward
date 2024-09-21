public class Main {
    public static void printPattern(int n){

        for(int row= 0; row< n  ; row++){


            for(int col =0 ; col< n ;col++ ){

                System.out.print("*");

            }

            System.out.println();

        }



    }

    public static void printStarPattern(int n ){

        for(int row  = 0 ; row< n ; row++){


            for(int col = 0 ; col<=row ; col++){

                System.out.print("*");

            }
            System.out.println();
        }



    }

    public static void printPattern3(int n ){

        for(int row = 0; row < n  ; row++){

            for(int col = 0; col<=row ; col++){

                System.out.print(col+1);

            }

            System.out.println();

        }



    }


    public static void printPattern4(int n ){

        for(int row = 0; row < n  ; row++){

            for(int col = 0; col<=row ; col++){

                System.out.print(row+1);

            }

            System.out.println();

        }



    }

    public static void printPattern5(int n ){

        for(int row = 0; row < n  ; row++){

            for(int col = 0; col<n-row ; col++){

                System.out.print(col+1);

            }

            System.out.println();

        }



    }

    public static void printPattern6(int n ){

        for(int row = 0; row < n  ; row++){

            for(int col = 0; col<n-row ; col++){

                System.out.print("*");

            }

            System.out.println();

        }



    }

    public static void printPattern7(int n ){

        for(int row = 0; row < n  ; row++){

            for(int col = 0; col < n-row-1 ; col++){

                System.out.print(" ");

            }

            for(int col = 0 ; col<2*row+1 ; col++){

                System.out.print("*");

            }

            for(int col = 0; col < n-row-1 ; col++){

                System.out.print(" ");

            }
            System.out.println();

        }



    }

       public static void printPattern8(int n){


        for(int row = 0 ; row< n ; row++){

            for(int col = 0 ; col< row ; col++){

                System.out.print(" ");

            }

             for (int col = 0; col< (2*n) - (2*row+1) ; col++){

                 System.out.print("*");


             }


            for(int col = 0 ; col< row ; col++){

                System.out.print(" ");

            }
               System.out.println();


        }


       }

       public static void print9(int n)
       {


         for(int i= 0 ; i< 2*n ; i++){

           int stars = i;

           if (i>n)
               stars= 2*n-i;

           for (int j = 0 ; j<stars ; j++){

               System.out.print("*");

           }

            System.out.println();

         }



       }

       public static void print10(int n ){

        int print = 0;
         for (int i = 0 ; i< n  ; i++){

             if(i%2==0){

                 print=1;

             }else {
                 print=0;
             }

            for (int j = 0 ; j<= i ; j++){
                System.out.print(print);
                print=1-print;
            }

             System.out.println();
         }



       }


    public static void main(String[] args) {
     print10(5);
    }
}