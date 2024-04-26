package Modul3;

public class ArrayQueue {
    private int front, rear, size;
    private int capacity;
    private int array[];

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (isFull()) {
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public boolean isFull() {
        return (this.size == this.capacity);
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }
}