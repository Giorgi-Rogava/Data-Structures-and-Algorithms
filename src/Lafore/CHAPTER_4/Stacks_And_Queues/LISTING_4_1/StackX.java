package Lafore.CHAPTER_4.Stacks_And_Queues.LISTING_4_1;

public class StackX {

    private int maxSize;
    private long[] stackArray;
    private int top;


    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }



    public void push(long j){

        stackArray[++top] = j;
    }

    public long pop(){
        return stackArray[top--];
    }


    public long peek(){
        return stackArray[top];
    }


    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }



}
