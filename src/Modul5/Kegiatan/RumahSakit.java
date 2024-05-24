package Modul5.Kegiatan;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


class RumahSakit {
    NodeKeg root;

    RumahSakit() {
        root = null;
    }

    public void insert(String key) {
        if (root == null) {
            root = new NodeKeg(key);
        } else {
            Queue<NodeKeg> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                NodeKeg temp = queue.poll();

                if (temp.left == null) {
                    temp.left = new NodeKeg(key);
                    break;
                } else {
                    queue.add(temp.left);
                }

                if (temp.right == null) {
                    temp.right = new NodeKeg(key);
                    break;
                } else {
                    queue.add(temp.right);
                }
            }
        }
    }


    void preOrder(NodeKeg nodeKeg) {
        if (nodeKeg != null) {
            System.out.print(nodeKeg.key + " ");
            preOrder(nodeKeg.left);
            preOrder(nodeKeg.right);
        }
    }

    void inOrder(NodeKeg nodeKeg) {
        if (nodeKeg != null) {
            inOrder(nodeKeg.left);
            System.out.print(nodeKeg.key + " ");
            inOrder(nodeKeg.right);
        }
    }

    void postOrder(NodeKeg nodeKeg) {
        if (nodeKeg != null) {
            postOrder(nodeKeg.left);
            postOrder(nodeKeg.right);
            System.out.print(nodeKeg.key + " ");
        }
    }

}

class RS {
    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSistem Rumah Sakit");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Pasien (Preorder)");
            System.out.println("3. Tampilkan Pasien (Inorder)");
            System.out.println("4. Tampilkan Pasien (Postorder)");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan banyaknya pasien: ");
                    int jumlahPasien = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < jumlahPasien; i++) {
                        System.out.print("Masukkan ID pasien " + (i + 1) + ": ");
                        String kode = scanner.nextLine();
                        rs.insert(kode);
                    }
                    break;
                case 2:
                    System.out.println("Preorder traversal:");
                    rs.preOrder(rs.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Inorder traversal:");
                    rs.inOrder(rs.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Postorder traversal:");
                    rs.postOrder(rs.root);
                    System.out.println();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("PILIH YANG ADA AJA");
                    break;
            }
        }
    }
}
