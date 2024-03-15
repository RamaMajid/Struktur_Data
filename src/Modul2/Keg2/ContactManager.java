package Modul2.Keg2;


public class ContactManager {
    Node head;

    void tambahKontak(String nama, String nomor){
        Contact kontak = new Contact(nama, nomor);
        Node node = new Node(kontak);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    void tampilKontak(){
        Node current = head;
        while (current != null) {
            System.out.println("Nama: " + current.contact.nama);
            System.out.println("Nomor Telepon: " + current.contact.nomor);
            current = current.next;
        }
    }

    void cariKontak(String nama){
        Node current = head;
        while (current != null) {
            if (current.contact.nama.equals(nama)){
                System.out.println("Kontak Ditemukan:");
                System.out.println("Nama: " + current.contact.nama);
                System.out.println("Nomor Telepon: " + current.contact.nomor);
                return;
            }
            current = current.next;
        }
        System.out.println("Kontak Tidak Ditemukan");
    }
}
