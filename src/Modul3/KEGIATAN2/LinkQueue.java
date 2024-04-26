package Modul3.KEGIATAN2;

public class LinkQueue {
    private FirstLastList list;

    public LinkQueue() {
        list = new FirstLastList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void insert(String name, int tickets, int id) {
        list.insertLast(name, tickets, id);
    }

    public Link remove() {
        return list.deleteFirst();
    }

    public Link removeById(int id) {
        return list.deleteById(id);
    }

    public void displayQueue() {
        list.displayList();
    }
}
