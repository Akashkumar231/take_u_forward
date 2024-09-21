package Stack_and_Queue;

import java.util.Arrays;

public class Array_Stack {

     private int pointer ;

     private int size ;

     private int [] array;

    Array_Stack(int size)
    {
        array= new int[size];

        this.pointer = -1;

    }

    public  void push(int element){

        if(pointer!=array.length){

            pointer++;
            array[pointer]=element;

        }else {
            throw new CustomizeException("No more space to enter the element in the stack");

        }

    }

    public int pop(){

        if (pointer==-1){
            throw  new CustomizeException("No more element to pop");
        }

        int element = array[pointer];

        pointer--;
        return element;

    }

    public int size(){

        return pointer+1;
    }


    @Override
    public String toString() {
        return "Array_Stack{" +
                "pointer=" + pointer +
                ", size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
