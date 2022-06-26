public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        System.out.println("Data Awal Linked List adalah: " + dll.getFirst());
        System.out.println("Data Akhir Linked List adalah: " + dll.getLast());
        System.out.println("Data Indeks ke-1 pada Linked List adalah: " + dll.get(1));
    }
}
