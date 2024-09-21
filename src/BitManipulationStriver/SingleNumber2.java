package BitManipulationStriver;

public class SingleNumber2 {

    public static int singleNumber(int [] array){
        int ans = 0;
        for(int bitIndex = 0 ; bitIndex < 32 ; bitIndex++){
            int count = 0;
            for(int i = 0 ; i< array.length ; i++){
                if (((array[i]) & (1<<bitIndex)) !=0){
                    count++;
                }
            }
            if (count%3 == 1){
                ans = ans | (1<<bitIndex);
            }
        }
        return ans;

    }

    public static void main(String [] args){

        int [] array = new int[]{5,5,5,6,4,4,4};

        System.out.println(singleNumber(array));

    }

}
