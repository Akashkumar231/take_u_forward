package Stack_and_Queue;
import java.util.Arrays;


public class Array_Queue {

    private int start  ;
    private int end;
    private int size;
    private int [] array;
    private int curr_size;

    public Array_Queue(int size){

        this.start=-1;
        this.end=-1;
        this.curr_size=0;
        this.size=size;
        this.array= new int[size];


    }

    public void push(int element){

        if(curr_size==size){
            throw new CustomizeException("Oops , Sorry you cannot place the element in the Queue");
        }

        if(curr_size == 0){
            start = 0 ;
            end = 0;
            array[end]=element;
        }else {

            end = (end +1 ) % size;
            array[end]=element;


        }
        curr_size+=1;

    }

    public int pop(){

        int deletedElement = 0 ;
        if(curr_size == 0){

            throw  new CustomizeException("The current size is Empty , Please make sure you should put element before delete it");

        }

        if (curr_size==1){
            deletedElement =array[start];

            start = end = -1;
        }else {
            deletedElement =array[start];
            array[start]=0;
            start = (start+1)%size;
        }

        curr_size = curr_size-1;

        return deletedElement;
    }

    public int top(){

        if(curr_size==0){
            throw new CustomizeException("You have not any Element in the Queue");
        }

        return array[start];
    }

    public int size(){
        return curr_size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array) + "";
    }
}
