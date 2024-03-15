package Modul2.Keg2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Tampilkan Kontak");
            System.out.println("3. Cari Kontak");
            System.out.println("4. Keluar");
            System.out.print("PILIH MENU (1/2/3/4): ");

            int pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih){
                case 1:
                    System.out.println("Masukkan Nama: ");
                    String nama =  scan.nextLine();
                    System.out.println("Masukkan Nomor Telepon: ");
                    String nomor = scan.nextLine();
                    manager.tambahKontak(nama, nomor);
                    break;

                case 2:
                    manager.tampilKontak();
                    break;

                case 3:
                    System.out.println("Masukkan Nama Kontak Yang Ingin Dicari: ");
                    String cari = scan.nextLine();
                    manager.cariKontak(cari);
                    break;

                case 4:
                    System.out.println("BYE");
                    break;

                default:
                    System.out.println("PILIH YANG PASTI-PASTI AJA");
            }
        }
    }
}
