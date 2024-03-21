package Modul3;

import java.util.LinkedList;
import java.util.Queue;

public class TesQueue {
    public static void main(String[] args) {
        Queue tes = new LinkedList();

        tes.add("Bebek");
        tes.add("Angsa");
        tes.add("Kuda");
        tes.add("Buaya");
        tes.add("Tikus");

        System.out.println("Peek: " + tes.peek());
        System.out.println("Animals: " + tes);

        tes.poll();
        tes.poll();

        System.out.println("Animals: " + tes);
    }
}
