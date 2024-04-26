package Modul3.KEGIATAN2;

public class FirstLastList {
    private Link first;
    private Link last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(String name, int tickets, int id) {
        Link newLink = new Link(name, tickets, id);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteById(int id) {
        Link current = first;
        Link previous = first;
        while (current.id != id) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
