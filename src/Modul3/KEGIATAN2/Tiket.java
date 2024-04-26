package Modul3.KEGIATAN2;

import java.util.Scanner;

public class Tiket {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        Scanner scanner = new Scanner(System.in);
        int idCounter = 1;

        while (true) {
            System.out.println("1. Pesan Tiket");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("3. Batalkan Pesanan");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Pemesan: ");
                    String name = scanner.next();
                    System.out.print("Jumlah Tiket Yang Ingin Dipesan: ");
                    int tickets = scanner.nextInt();
                    queue.insert(name, tickets, idCounter++);
                    break;
                case 2:
                    queue.displayQueue();
                    break;
                case 3:
                    System.out.print("Masukkan ID Tiket Yang Ingin Dibatalkan: ");
                    int id = scanner.nextInt();
                    Link removedLink = queue.removeById(id);
                    if (removedLink != null) {
                        System.out.println("Tiket dengan ID: " + removedLink.id + " telah dibatalkan");
                    } else {
                        System.out.println("Tiket ID tak ditemukan: " + id);
                    }
                    break;
                default:
                    System.out.println("PILIH YANG ADA AJA");
            }
        }
    }
}
