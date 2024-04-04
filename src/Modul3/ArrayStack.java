package Modul3;

import java.util.Arrays;

public class ArrayStack {
    private int size = 0;
    private Object[] elements = new Object[5];

    public void push(Object element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = element;
    }

    public Object pop() {
        if (size == 0) {
            return null;
        }
        Object poppedElement = elements[--size];
        elements[size] = null;
        return poppedElement;
    }

    public int size() {
        return size;
    }
}