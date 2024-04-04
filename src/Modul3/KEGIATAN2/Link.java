package Modul3.KEGIATAN2;

public class Link {
    public String name;
    public int tickets;
    public int id;
    public Link next;

    public Link(String name, int tickets, int id) {
        this.name = name;
        this.tickets = tickets;
        this.id = id;
    }

    public void displayLink() {
        System.out.println("Order ID: " + id + ", Name: " + name + ", Tickets: " + tickets);
    }
}
