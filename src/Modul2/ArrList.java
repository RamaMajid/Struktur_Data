package Modul2;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Rama");
        daftarNama.add("Ra");
        daftarNama.add("Ram");
        daftarNama.add("R");
        daftarNama.add("Ramadany");

        System.out.println("Daftar Nama:");
        for (String nama : daftarNama){
            System.out.println(nama);
        }

        System.out.println("Elemen pada indeks 2: " + daftarNama.get(2));

        daftarNama.set(1, "Tamvan");

        System.out.println("Daftar nama setelah perubahan:");
        for (String nama : daftarNama){
            System.out.println(nama);
        }

        daftarNama.remove(0);

        System.out.println("Daftar nama setelah penghapusan:");
        for (String nama : daftarNama){
            System.out.println(nama);
        }

        System.out.println("Jumlah elemen dalam ArrayList: " + daftarNama.size());

        System.out.println("Apakah ArrayList kosong? " + daftarNama.isEmpty());
    }
}
