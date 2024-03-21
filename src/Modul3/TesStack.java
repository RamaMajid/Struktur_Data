package Modul3;

import java.util.Stack;

public class TesStack {
    public static void main(String[] args) {
        Stack tes = new Stack();

        System.out.println(tes.empty());


        tes.push("Bebek");
        tes.push("Angsa");
        tes.push("Kuda");
        tes.push("Buaya");
        tes.push("Tikus");

        System.out.println(tes.empty());

        System.out.println("Peek: " + tes.peek());
        System.out.println("Animals: " + tes);

        tes.pop();
        tes.pop();

        System.out.println("Animals: " + tes);
        System.out.println("Position of Kuda: " + tes.search("Bebek"));
    }
}
