package Modul3.KEGIATAN1;

public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String url) {
        if (top < maxSize - 1) {
            stackArray[++top] = url;
        } else {
            System.out.println("JANGAN MARUK, PUSH KOK BANYAK BANGET SAMPAI FULL");
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("MASIH KOSONG JADI NGAPAIN DI POP?");
            return "";
        }
    }

    public String peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("KAN MASIH KOSONG, NGAPAIN DI LIHAT?");
            return "";
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void displayStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }
}
