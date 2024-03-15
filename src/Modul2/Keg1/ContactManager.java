package Modul2.Keg1;

import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contact = new ArrayList<>();

    void tambahKontak(String nama, String nomor){
        Contact kontak = new Contact(nama, nomor);
        contact.add(kontak);
    }

    void tampilKontak(){
        for (Contact kontak : contact){
            System.out.println("Nama: " + kontak.nama);
            System.out.println("Nomor Telepon: " + kontak.nomor);
        }
    }

    void cariKontak(String nama){
        for (Contact kontak : contact){
            if (kontak.nama.equals(nama)){
                System.out.println("Kontak Ditemukan:");
                System.out.println("Nama: " + kontak.nama);
                System.out.println("Nomor Telepon: " + kontak.nomor);
                return;
            }
        }
        System.out.println("Kontak Tidak Ditemukan");
    }
}