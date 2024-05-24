package Modul5.Kegiatan;

public class NodeKeg {
    String key, isbn, judul;
    NodeKeg left, right;

    public NodeKeg(String item) {
        key = item;
        left = right = null;
    }

    public NodeKeg(String isbn, String judul){
        this.isbn = isbn;
        this.judul = judul;
        left = right = null;

    }
}