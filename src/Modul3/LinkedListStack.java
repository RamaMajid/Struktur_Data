package Modul3;

public class LinkedListStack {
    private Node head;

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Object pop() {
        if (head == null) {
            return null;
        }
        Object poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}