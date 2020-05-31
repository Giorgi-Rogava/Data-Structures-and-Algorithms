package Lafore.CHAPTER_4.Stacks_And_Queues.LISTING_4_4;

public class Queue {

    private int maxSize;
    public long[] queArray;
    public int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }


    public void insert(long j) { // The insert() method assumes that the queue is not full

        if (rear == maxSize - 1) {
            rear = -1;
        }

        queArray[++rear] = j;
        nItems++;

    }

    public long remove() {

        long temp = queArray[front++];

        if (front == maxSize) {
            front = 0;
        }

        nItems--;
        return temp;
    }


    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

}
