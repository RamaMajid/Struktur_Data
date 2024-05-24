package Modul5.Kegiatan;

import java.util.Scanner;
import java.util.regex.Pattern;

class BookSearchTree {
    NodeKeg root;

    public BookSearchTree() {
        root = null;
    }

    public boolean input(String isbn, String judul) {
        if (searchBookRec(root, isbn) != null) {
            return false;
        }
        root = inputRec(root, isbn, judul);
        return true;
    }

    private NodeKeg inputRec(NodeKeg root, String isbn, String title) {
        if (root == null) {
            root = new NodeKeg(isbn, title);
            return root;
        }
        if (isbn.compareTo(root.isbn) < 0) {
            root.left = inputRec(root.left, isbn, title);
        } else if (isbn.compareTo(root.isbn) > 0) {
            root.right = inputRec(root.right, isbn, title);
        }
        return root;
    }


    public void preOrderTraversal(NodeKeg node) {
        if (node != null) {
            System.out.println("ISBN: " + node.isbn + ", Judul: " + node.judul);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal(NodeKeg node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println("ISBN: " + node.isbn + ", Judul: " + node.judul);
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(NodeKeg node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println("ISBN: " + node.isbn + ", Judul: " + node.judul);
        }
    }

    public void searchBook(String isbn) {
        NodeKeg result = searchBookRec(root, isbn);
        if (result != null) {
            System.out.println("Buku dengan ISBN " + isbn + " ditemukan: " + result.judul);
        } else {
            System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan.");
        }
    }

    private NodeKeg searchBookRec(NodeKeg root, String isbn) {
        if (root == null || root.isbn.equals(isbn)) {
            return root;
        }
        if (isbn.compareTo(root.isbn) < 0) {
            return searchBookRec(root.left, isbn);
        }
        return searchBookRec(root.right, isbn);
    }

    public void displayAllBooks() {
        if (root == null) {
            System.out.println("Inventaris buku kosong.");
        } else {
            System.out.println("Daftar Semua Buku:");
            inOrderTraversal(root);
        }
    }
}

public class BookInventory {
    public static void main(String[] args) {
        BookSearchTree inventory = new BookSearchTree();

        inventory.input("100", "The Great Gatsby");
        inventory.input("101", "Astaghfirullah");
        inventory.input("102", "Budreg");

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSistem Manajemen Inventaris Toko Buku");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Cari Buku berdasarkan ISBN");
            System.out.println("3. Tampilkan Semua Buku");
            System.out.println("4. Tampilkan Semua Buku (Preorder)");
            System.out.println("5. Tampilkan Semua Buku (Inorder)");
            System.out.println("6. Tampilkan Semua Buku (Postorder)");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ISBN buku: ");
                    String isbn = scanner.nextLine();
                    if (isValidISBN(isbn)) {
                        System.out.print("Masukkan judul buku: ");
                        String title = scanner.nextLine();
                        if (!inventory.input(isbn, title)) {
                            System.out.println("Buku dengan ISBN " + isbn + " sudah ada. Silakan masukkan ISBN yang berbeda.");
                        }
                    } else {
                        System.out.println("ISBN tidak valid, ISBN harus terdiri dari 3 digit angka.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan ISBN buku untuk mencari: ");
                    String searchISBN = scanner.nextLine();
                    inventory.searchBook(searchISBN);
                    break;
                case 3:
                    inventory.displayAllBooks();
                    break;
                case 4:
                    System.out.println("Preorder traversal:");
                    inventory.preOrderTraversal(inventory.root);
                    break;
                case 5:
                    System.out.println("Inorder traversal:");
                    inventory.inOrderTraversal(inventory.root);
                    break;
                case 6:
                    System.out.println("Postorder traversal:");
                    inventory.postOrderTraversal(inventory.root);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("PILIH YANG ADA AJA");
                    break;
            }
        }
    }

    private static boolean isValidISBN(String isbn) {
        return Pattern.matches("^\\d{3}$", isbn);
    }
}
