package Arrays;

public class LargestElement {

    public static int largest(int arr[], int n)
    {


        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i< n ;i++){

            if(largest<arr[i]){

                largest = arr[i];

            }

        }

        return largest;

    }

    public static void main(String [] args){

        int [] array = new int[]{25,65,32,56,35,6};

        System.out.println(largest(array,array.length));


    }

}
