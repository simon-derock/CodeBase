package MyStack;

public class CustomStack {
    /*
    push, pop, peek, isEmpty, isFull
     */

    protected int [] array;
    private static final int DEFAULT_SIZE = 10;
    public int pntr = -1;


    public CustomStack() {
        //  this(DEFAULT_SIZE);
        this.array = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.array = new int[size];
    }

    public boolean push(int val) throws CustomStackException{
        if(isFull()){
            throw new CustomStackException("Stack is Full..");
        }
        array[++pntr] = val;
        return true;
    }

    public int pop() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Stack is Empty..");
        }
        return array[pntr--];
    }

    public int peek() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Stack is Empty..");
        }
        return array[pntr];
    }

    public boolean isFull(){
        return (pntr == array.length -1)?true:false;
    }

    public boolean isEmpty(){
        return (pntr == -1)?true:false;
    }

}
