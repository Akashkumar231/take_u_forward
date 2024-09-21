package Arrays;

public class secondLargest {

    static int print2largest(int arr[], int n) {

        int Largest =-1;
        int secondLargest = -1;

        for(int i = 0 ; i< n ;i++){

            if(Largest<arr[i]){

                secondLargest = Largest;
                Largest = arr[i];

            }else if(secondLargest<arr[i] && Largest!=arr[i]){

                secondLargest = arr[i];
            }



        }

        return secondLargest;

    }

    public static void main(String [] args){


        int [] array = new int[]{25,65,32,56,35,6};

        System.out.println(print2largest(array,array.length));

    }

}
