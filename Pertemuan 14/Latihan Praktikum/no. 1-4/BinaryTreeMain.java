public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree binary = new BinaryTree();

        binary.add(6);
        binary.add(4);
        binary.add(8);
        binary.add(3);
        binary.add(5);
        binary.add(7);
        binary.add(9);
        binary.add(10);
        binary.add(15);
        binary.addrekursif(21);
        binary.addrekursif(25);
        binary.addrekursif(15);
        binary.addrekursif(17);
        binary.addrekursif(19);
        binary.addrekursif(18);
        binary.addrekursif(20);
        binary.addrekursif(16);
        binary.traversePreOrder(binary.root);
        System.out.println("");
        binary.traverseInOrder(binary.root);
        System.out.println("");
        binary.traversePostOrder(binary.root);
        System.out.println("");
        System.out.println("Find " + binary.find(5));
        binary.delete(8);
        binary.traversePreOrder(binary.root);
        System.out.println("");
        System.out.print("LEAF: ");
        binary.printLeaves(binary.root);
        System.out.println();
        System.out.println("Total LEAF: " + binary.total);
        System.out.println("Nilai Paling Kecil: " + binary.Min(binary.root));
        System.out.println("Nilai Paling Besar: " + binary.Max(binary.root));
    }
}