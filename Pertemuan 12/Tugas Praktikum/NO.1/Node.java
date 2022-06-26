public class Node{
    int data;
    String nama;
    Node prev, next;

    Node(Node prev, int data, String nama, Node next) {
        this.prev = prev;
        this.data = data;
        this.nama = nama;
        this.next = next;
    }
}