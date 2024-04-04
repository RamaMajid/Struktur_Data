package Modul3.KEGIATAN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Masukkan URL");
            System.out.println("2. URL Sebelumnya");
            System.out.println("3. URL Selanjutnya");
            System.out.println("4. Tampilkan URL Saat Ini");
            System.out.println("5. Riwayat URL");
            System.out.println("5. Exit");
            System.out.print("PILIH: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.next();
                    browser.visit(url);
                    break;
                case 2:
                    browser.back();
                    break;
                case 3:
                    browser.forward();
                    break;
                case 4:
                    System.out.println("Current URL: " + browser.currentUrl());
                    break;
                case 5:
                    browser.displayHistory();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("JANGAN PILIH YANG NGGAK ADA");
            }
        }
    }
}
