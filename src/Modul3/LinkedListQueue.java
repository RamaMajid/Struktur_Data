package Modul3;

public class LinkedListQueue {
    private Node front, rear;

    private class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public LinkedListQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    public void dequeue() {
        if (this.front == null) {
            return;
        }

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
    }
}