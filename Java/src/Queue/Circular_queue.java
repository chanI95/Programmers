package Queue;
import java.util.Arrays;

public class Circular_queue {

    private int[] array;
    private int capacity;
    private int rear = 0, front = 0;
    private char flag = 0;

    public ArrayCircularQueue_2(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public ArrayCircularQueue_2() {
        this.capacity = 5;
        this.array = new int[capacity];
    }

    public int size() {
        return (capacity * flag + (rear - front));
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void enqueue(int data) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException();

        this.array[rear] = data;
        this.rear = (this.rear + 1) % capacity;

        if (front >= rear) flag = 1;
        else flag = 0;
    }

    public int dequeue() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException();

        int data = this.array[front];
        this.array[front] = 0;
        this.front = (this.front + 1) % capacity;

        if (front > rear) flag = 1;
        else flag = 0;
        return data;
    }

    public int peek() {
        return this.array[front];
    }

    @Override public String toString() {
        return Arrays.toString(array) + " ,  size : " + size();
    }
}