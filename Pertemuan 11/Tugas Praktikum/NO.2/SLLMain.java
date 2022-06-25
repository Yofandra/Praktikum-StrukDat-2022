public class SLLMain{
    public static void main(String[] args) throws Exception{
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.insertAfter('a', 'c');
        singLL.print();
        singLL.insertBefore('c', 'b');
        singLL.print();
        singLL.insertAt(3, 'd');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        System.out.println("Nilai Head: ");
        singLL.printHead();

    }
}