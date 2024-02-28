package Tugas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Barang<String, Integer>> daftarItem = new ArrayList<>();

        while (true){
            System.out.print("Masukkan Item: ");
            String namaItem = scan.nextLine();

            System.out.print("Masukkan Harga: ");
            int hargaItem = scan.nextInt();
            scan.nextLine();

            System.out.println("Pilih Kategori: (1. MAKANAN, 2. MINUMAN, 3. DESSERT) ");
            int pilih = scan.nextInt();
            scan.nextLine();

            jenisBarang kategori = null;

            switch (pilih){
                case 1:
                    kategori = jenisBarang.MAKANAN;
                    break;

                case 2:
                    kategori = jenisBarang.MINUMAN;
                    break;

                case 3:
                    kategori = jenisBarang.DESSERT;
                    break;
            }

            Barang<String, Integer> barang = new Barang<>(namaItem, hargaItem, kategori);
            daftarItem.add(barang);

            System.out.print("Apakah Anda ingin menambahkan barang lagi? (Y/T): ");
            String jawaban = scan.nextLine();

            if (!jawaban.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("\nDaftar Barang:");
        for (Barang<String, Integer> barang : daftarItem) {
            System.out.println(barang.toString() + "\n");
        }
    }
}