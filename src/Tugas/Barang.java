package Tugas;

enum jenisBarang{
    MAKANAN,
    MINUMAN,
    DESSERT
}

public class Barang <T, U> {
    private T item1;
    private U item2;
    private jenisBarang kategori;

    public Barang(T item1, U item2, jenisBarang kategori){
        this.item1 = item1;
        this.item2 = item2;
        this.kategori = kategori;
    }

    public T getItem1() {
        return this.item1;
    }

    public U getItem2(){
        return this.item2;
    }

    public jenisBarang getKategori() {
        return kategori;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }

    public void setKategori(jenisBarang kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "Nama Item: " + item1 + '\n' +
                "Harga Item: " + item2 + '\n' +
                "Kategori: " + kategori;
    }
}

